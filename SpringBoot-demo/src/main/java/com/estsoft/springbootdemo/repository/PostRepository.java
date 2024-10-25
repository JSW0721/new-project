package com.estsoft.springbootdemo.repository;

import com.estsoft.springbootdemo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    //select *from where is_deleted = 0 and user_id = 1 order by created_at desc;
    List<Post> findAllByIsDeletedOrderByCreatedAtDesc(Boolean isDeleted);
    Post findByIdAndIsDeleted(Long postId, Boolean isDeleted);
}
