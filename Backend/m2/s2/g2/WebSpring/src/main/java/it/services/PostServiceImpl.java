package it.services;

import it.entities.Post;
import it.repositories.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository posts;


    @Override
    public Optional<Post> save(Post post) {
        try{
            return Optional.of(posts.save(post))
        }catch (Exception e){
            log.error(String.format("Exeption saving post %s", post), e);
            return Optional.empty();
        }
    }

    public Optional<Post> getPostById(Long id) {
        return posts.findById(id);
    }

    @Override
    public List<Post> getAll() {
        return posts.findAll();
    }

    @Override
    public Optional<Post> modifyPost(Long id, Post p) {
        try{
            var post = posts.findById().orElseThrow();
            post.builder()
                    .withCategory(p.getCategory())
                    .withContent(p.getContent())
                    .withCover(p.getCover())
                    .withTitle(p.getTitle())
                    .withLectureTime(p.getLectureTime())
                    .build();
            return Optional.of(posts.save(post));
        }
        catch (NoSuchElementException e){
            log.error(String.format("User with id = %s not found", id), e);
        }
        return Optional.empty();
    }

    @Override
    public void removePost(Long id) {
        try{
            var post = posts.findById(id).orElseThrow();
            posts.delete(post);
            return Optional.of(posts.save());
        }catch (NoSuchElementException e){
            log.error(String.format("User with id = %s not found", id), e);
        }

    }
}
