package com.likelion.springsession.comment.repository;

import com.likelion.springsession.comment.entity.Comment;
import com.likelion.springsession.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost(Post post);
    Optional<Comment> findByIdAndPost(Long id, Post post);
}
