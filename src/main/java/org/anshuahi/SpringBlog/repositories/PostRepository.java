package org.anshuahi.SpringBlog.repositories;

import org.anshuahi.SpringBlog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
