package com.nikolaybondarenko.web.instazoo.repository;

import com.nikolaybondarenko.web.instazoo.entity.Comment;
import com.nikolaybondarenko.web.instazoo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost(Post post);

    Comment findByIdAndUserId(Long commentId, Long userId);

}
