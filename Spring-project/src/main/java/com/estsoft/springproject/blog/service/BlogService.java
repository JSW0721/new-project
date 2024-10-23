package com.estsoft.springproject.blog.service;

import com.estsoft.springproject.blog.domain.DTO.AddArticleRequest;
import com.estsoft.springproject.blog.domain.Article;
import com.estsoft.springproject.blog.domain.DTO.ArticleResponse;
import com.estsoft.springproject.blog.domain.DTO.UpdateArticleRequest;
import com.estsoft.springproject.blog.repository.BlogRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogService {
    private BlogRepository repository;

    public BlogService(BlogRepository repository) {
        this.repository = repository;
    }
    //blog 게시글 저장
    //repository.save(Article)
    public Article saveArticle(AddArticleRequest request) {
        return repository.save(request.toEntity());
    }
    //blog게시글 조회
    public List<Article> findAll(){
        return repository.findAll();
    }
    //blog게시글 단건 조회
    public Article findBy(Long id){
        return  repository.findById(id).orElseThrow(()->new IllegalArgumentException("Article Not found by "+id));
    }
    //blog게시글 단건 삭제
    public void deleteById(Long id){
        repository.deleteById(id);
    }
    @Transactional
    public Article update(Long id, UpdateArticleRequest requ){
        //기존에 있던 블르그글을 가져와서 바꿔줄 예정
        Article article = findBy(id);
        article.update(requ.getTitle(),requ.getContent());
        //article,update(title,content)
        return article;
    }
}
