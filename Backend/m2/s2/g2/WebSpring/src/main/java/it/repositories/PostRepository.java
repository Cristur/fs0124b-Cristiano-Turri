package it.repositories;

import it.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public class PostRepository extends JpaRepository<Post,Long> {
}
