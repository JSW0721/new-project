package com.estsoft.springproject.blog.Controller;

import com.estsoft.springproject.blog.domain.Article;
import com.estsoft.springproject.blog.domain.DTO.AddArticleRequest;
import com.estsoft.springproject.blog.domain.DTO.UpdateArticleRequest;
import com.estsoft.springproject.blog.repository.BlogRepository;
import com.estsoft.springproject.blog.service.BlogService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class BlogControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ObjectMapper om;

    @Autowired
    private BlogRepository repository;

    @Autowired
    private BlogService blogService;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        repository.deleteAll();
    }
    //POST /articles API 테스트
    @Test
    public void addArticle() throws Exception {
        //given : article 저장
        AddArticleRequest request = new AddArticleRequest("제목","내용");

        //직렬화(object -> json)
        String json = om.writeValueAsString(request);

        //when : POST /articles API 호풀
        ResultActions ra = mockMvc.perform(post("/articles")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));

        //then : 호출 결과 검증
        ra.andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value(request.getTitle()))
                .andExpect(jsonPath("$.content").value(request.getContent()));

        List<Article> articleList = repository.findAll();
        assertThat(articleList.size()).isEqualTo(1);
    }
    //blog게시글 조회.
    @Test
    public void findAll() throws Exception {//perform 메서드의 예외 처리
        //given : 조회시 필요한 값들
        Article article = repository.save(new Article("title","content"));
        //when : 조회 API
        ResultActions ra = mockMvc.perform(get("/articles").accept(MediaType.APPLICATION_JSON));
        //then : API 호출 결과 검증
        ra.andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value(article.getTitle()))
                .andExpect(jsonPath("$[0].content").value(article.getContent()));
    }
    //data insert(id=1), GET /articles/1
    @Test
    public void findOne() throws Exception {
        //given : data insert
        Article article = repository.save(new Article("title","content"));
        Long id = article.getId();
        //when
        ResultActions ra = mockMvc.perform(get("/articles/{id}",id).accept(MediaType.APPLICATION_JSON));
        //then
        ra.andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(article.getTitle()))
                .andExpect(jsonPath("$.title").value(article.getTitle()))
                .andExpect(jsonPath("$.content").value(article.getContent()));
    }
    @Test
    public void deleteArticle() throws Exception {
        Article article = repository.save(new Article("title","content"));
        Long id = article.getId();

        ResultActions ra = mockMvc.perform(delete("/articles/{id}",id));

        ra.andExpect(status().isOk());
        List<Article> articleList =  repository.findAll();
        Assertions.assertThat(articleList).isEmpty();
    }
    @Test
    public void findOneException() throws Exception {
       ResultActions ra = mockMvc.perform(get("/articles/{id}", 1L).accept(MediaType.APPLICATION_JSON));
       ra.andExpect(status().isBadRequest());

       assertThrows(IllegalArgumentException.class, () -> blogService.findBy(1L));
    }
    //put /articles/{id} body(json content)요청
    @Test
    public void updateArticle() throws Exception {
        Long id = 1L;
        Article article = repository.save(new Article("title","content"));

        //수정 데이터 -> json
        UpdateArticleRequest requ = new UpdateArticleRequest("변경제목","변경내용");
        String updateJasonContent = om.writeValueAsString(requ);

        ResultActions ra = mockMvc.perform(put("/article/{id}", id).contentType(MediaType.APPLICATION_JSON).content(updateJasonContent));
    }
    //수정 API status code 4XX, 예외 검증.
    @Test
    public void updateException() throws Exception {
        ResultActions ra = mockMvc.perform(put("/article/{id}", 1L).accept(MediaType.APPLICATION_JSON));
        ra.andExpect(status().isBadRequest());

        assertThrows(IllegalArgumentException.class, () -> blogService.findBy(1L));
    }
    @Test
    public void updateNotExistsArticle() throws Exception {
        Long NotExistid = 10000L;
        UpdateArticleRequest requ = new UpdateArticleRequest("title", "content");
        String updateJsonContent = om.writeValueAsString(requ);

        ResultActions actions = mockMvc.perform(put("/article/{id}", NotExistid)
                .contentType(MediaType.APPLICATION_JSON)
                .content(updateJsonContent));

        actions.andExpect(status().isBadRequest());
        assertThrows(IllegalArgumentException.class,() -> blogService.update(NotExistid, requ));
        assertThrows(IllegalArgumentException.class, () -> blogService.findBy(NotExistid));
    }
}