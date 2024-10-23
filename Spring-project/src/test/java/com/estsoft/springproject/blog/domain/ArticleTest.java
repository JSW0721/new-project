package com.estsoft.springproject.blog.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {
    @Test
    public void tet(){
        Article article = new Article("title","content");
        //빌더 패턴
        Article articleBuilder = Article.builder()
                                .title("제목")
                                .content("내용")
                                .build();
    }
}