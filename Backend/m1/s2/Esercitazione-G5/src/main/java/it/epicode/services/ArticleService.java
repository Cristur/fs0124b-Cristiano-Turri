package it.epicode.services;

import it.epicode.libreria.Article;
import it.epicode.libreria.Book;

import java.util.Optional;

public interface ArticleService {
    void addArticle(Article article);
    void deleteArticleByISBN(int ISBN);
    Optional<Article> findByISBN(int ISBN);
    Optional<Article> findByYear(int year);
    Optional<Book> findByAuthor(String author);
}
