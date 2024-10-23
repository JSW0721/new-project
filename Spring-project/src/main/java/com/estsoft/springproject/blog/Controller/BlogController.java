package com.estsoft.springproject.blog.Controller;

import com.estsoft.springproject.blog.domain.DTO.AddArticleRequest;
import com.estsoft.springproject.blog.domain.Article;
import com.estsoft.springproject.blog.domain.DTO.ArticleResponse;
import com.estsoft.springproject.blog.domain.DTO.UpdateArticleRequest;
import com.estsoft.springproject.blog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //log 작성하기 위한 어노테이션.
@RestController
@RequestMapping("/api")
public class BlogController {
    private final BlogService service;

    public BlogController(BlogService service){
        this.service = service;
    }
    //RequestMapping (특정 URL  GET /articles)
    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping("/articles")
    public ResponseEntity<ArticleResponse> writeArticle(@RequestBody AddArticleRequest request){

        Article article = service.saveArticle(request);

        System.out.println(request.getTitle());
        System.out.println(request.getContent());

        //trace,debug,ingo,warn,error
        log.info("{},{}", request.getTitle(), request.getContent());
        log.trace("{},{}", request.getTitle(), request.getContent());
        log.debug("{},{}", request.getTitle(), request.getContent());

        return ResponseEntity.status(HttpStatus.CREATED).body(article.toArticleResponse());
    }
    //Request Mapping blog리스트 가져오기
    @GetMapping("/articles")
    public ResponseEntity<List<ArticleResponse>> findAll(){
        List<ArticleResponse> articleList = service.findAll().stream()
                .map(Article::toArticleResponse)
                .toList();
        return ResponseEntity.ok(articleList);
    }
    //Request Mapping blog 단건 조회
    @GetMapping("/articles/{id}")
    public ResponseEntity<ArticleResponse> findById(@PathVariable Long id){
        Article article = service.findBy(id); // 실패 케이스 : Exception(5XX 서버 오류) -> 4xx Status Code

        //Article -> ArticleResponse
        return ResponseEntity.ok(article.toArticleResponse());
    }
    @GetMapping("/articles/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @ExceptionHandler(IllegalArgumentException.class) //500번대 오류를 400번대 오류로 전환하여 표시.
    public ResponseEntity<String> handleillegqlArgumentException(IllegalArgumentException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @PutMapping("/articles/{id}")
    public ResponseEntity<ArticleResponse> updateArticle(@PathVariable Long id,@RequestBody UpdateArticleRequest request){
        Article UpdatedArticle = service.update(id, request);
        return ResponseEntity.ok(UpdatedArticle.toArticleResponse());
    }
}
