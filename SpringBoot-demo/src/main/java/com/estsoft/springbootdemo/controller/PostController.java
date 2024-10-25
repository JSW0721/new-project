package com.estsoft.springbootdemo.controller;

import com.estsoft.springbootdemo.entity.Post;
import com.estsoft.springbootdemo.model.PostRequest;
import com.estsoft.springbootdemo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService ps;

    @GetMapping("/post/list")
    public ResponseEntity <List<Post>> getPostList(
            @RequestParam(name = "isDeleted",defaultValue = "false")Boolean isDeleted
    ) {
        return ResponseEntity.ok(ps.getPostList(isDeleted));
    }
    @PostMapping("/post")
    public ResponseEntity<String> getPostList(
            @RequestParam PostRequest pr){
            ps.createPost(pr);

            return ResponseEntity.ok("Success");
    }
}
