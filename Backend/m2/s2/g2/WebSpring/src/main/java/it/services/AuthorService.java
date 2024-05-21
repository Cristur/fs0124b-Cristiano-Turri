package it.services;

import it.entities.Author;


import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<Author> save(Author author);
    List<Author> getAll();
    Optional<Author> modifyPost(Long id, Author author);
    void removePost(Long id)
}
