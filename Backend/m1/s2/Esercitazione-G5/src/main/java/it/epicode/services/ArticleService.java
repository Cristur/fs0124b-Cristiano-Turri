package it.epicode.services;

import it.epicode.libreria.Article;
import it.epicode.libreria.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ArticleService {
    void addArticle(Article article);
    void deleteArticleByISBN(Long ISBN);
    Optional<Article> findByISBN(Long ISBN);
    List<Article> findByYear(int year);
    List<Article> findByAuthor(String author);
    ArrayList<Article> getArticles();
}
