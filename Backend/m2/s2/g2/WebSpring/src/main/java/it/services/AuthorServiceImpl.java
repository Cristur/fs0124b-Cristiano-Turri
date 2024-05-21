package it.services;

import it.entities.Author;
import it.entities.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorService authors;

    @Override
    public Optional<Author> save(Author author) {
        try{
            return Optional.of(authors.save(author))
        }catch (Exception e){
            log.error(String.format("Exeption saving author %s", author), e);
            return Optional.empty();
        }
    }

    public Optional<Author> getAuthorById(Long id) {
        return authors.findById()
    }

    @Override
    public List<Author> getAll() {
        return authors.findAll();
    }

    @Override
    public Optional<Author> modifyAuthor(Long id, Author p) {
        try{
            var author = authors.findById().orElseThrow();
            author.builder()
                    .withCategory(p.getCategory())
                    .withContent(p.getContent())
                    .withCover(p.getCover())
                    .withTitle(p.getTitle())
                    .withLectureTime(p.getLectureTime())
                    .build();
            return Optional.of(authors.save(author));
        }
        catch (NoSuchElementException e){
            log.error(String.format("User with id = %s not found", id), e);
        }
        return Optional.empty();
    }

    @Override
    public void removeAuthor(Long id) {
        try{
            var post = posts.findById(id).orElseThrow();
            posts.delete(post);
            return Optional.of(posts.save());
        }catch (NoSuchElementException e){
            log.error(String.format("User with id = %s not found", id), e);
        }

    }
}
