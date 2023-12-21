package br.com.udemy.springapiblog.model.repository;

import br.com.udemy.springapiblog.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
