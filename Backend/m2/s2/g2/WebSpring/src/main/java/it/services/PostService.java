package it.services;

import it.entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> save(Post post);
    List<Post> getAll();
    Optional<Post> modifyPost(Long id, Post p);
    void removePost(Long id)
}
