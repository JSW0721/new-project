package com.estsoft.springproject.blog.Controller;

import com.estsoft.springproject.blog.domain.Article;
import com.estsoft.springproject.blog.domain.DTO.ArticleResponse;
import com.estsoft.springproject.blog.domain.DTO.ArticleViewResponse;
import com.estsoft.springproject.blog.service.BlogService;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogPageController {
    private final BlogService bs;
    private final BlogService blogService;

    public BlogPageController(BlogService bs, BlogService blogService){
        this.bs = bs;
        this.blogService = blogService;
    }
    @GetMapping("?articles")
    public String showArticle(Model model){
        List<Article> articleList = bs.findAll();

        List<ArticleViewResponse> list = articleList.stream().map(ArticleViewResponse::new).toList();
        model.addAttribute("articles",list);

        return "articleList";//articleList.html
    }

    //GET /artiles/{id}
    @GetMapping("/articles/{id}")
    public String showDetails(@PathVariable Long id, Model model){
        Article article = blogService.findBy(id);
        model.addAttribute("article",new ArticleResponse(article));
        return "article";
    }
    @GetMapping("/new-articles")
    public String addArticle(@RequestParam(required = false) Long id, Model model){
        if(id==null){
            model.addAttribute("article", new ArticleResponse(article));
        }else{
            Article article = blogService.findBy(id);

        }
        return "newArticle";
    }
}
