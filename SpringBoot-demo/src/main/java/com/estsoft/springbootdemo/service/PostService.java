package com.estsoft.springbootdemo.service;

import com.estsoft.springbootdemo.entity.Post;
import com.estsoft.springbootdemo.model.PostRequest;
import com.estsoft.springbootdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository pr;

    public List<Post> getPostList(Boolean isDeleted) {
        return pr.findAllByIsDeletedOrderByCreatedAtDesc(isDeleted);
    }

    public Post getPost(Long postId, Boolean isDeleted) {
        return pr.findByIdAndIsDeleted(postId, isDeleted);
    }

    @Transactional
    public void createPost(PostRequest prq) {
        Post post = new Post();
        post.setTitle(prq.getTitle());
        post.setCategoryId(prq.getCategoryId());
        post.setCategoryId(prq.getCategoryId());
        post.setContent(prq.getContent());
        post.setIsDeleted(false);
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());

        pr.save(post);
    }
}
