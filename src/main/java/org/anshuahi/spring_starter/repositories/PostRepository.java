package org.anshuahi.spring_starter.repositories;

import org.anshuahi.spring_starter.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
