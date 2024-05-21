package it.repositories;

import it.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public class AuthorRepository extends JpaRepository<Author, Long> {
}
