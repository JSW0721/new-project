package com.estsoft.springproject.blog.domain.DTO;

import com.estsoft.springproject.blog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddArticleRequest {
    private Long id;
    private String title;
    private String content;

    public Article toEntity(){
        return Article.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }
}
