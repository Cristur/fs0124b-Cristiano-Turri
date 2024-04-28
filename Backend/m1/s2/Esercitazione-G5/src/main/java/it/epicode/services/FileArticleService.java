package it.epicode.services;

import it.epicode.libreria.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Optional;


public class FileArticleService implements ArticleService {


    private static final Logger logger = LoggerFactory.getLogger(FileArticleService.class);
    private static final String STORAGE = "./Articles.my";

    private static final ArrayList<Article> articles = new ArrayList<>();



    @Override
    public void addArticle(Article article) {
        articles.add(article);
        save();
    }

    @Override
    public void deleteArticleByISBN(int ISBN) {
        var article = articles.stream().filter(e -> e.getISBN() == ISBN).findAny();
        if(article.isPresent()){
            articles.remove(article);
            save();
        }
    }

    @Override
    public Optional<Article> findByISBN(int ISBN) {
        var article = articles.stream().filter(e -> e.getISBN() == ISBN).findAny();
        return article;
        }

    @Override
    public Optional<Article> findByYear(int year) {
        var article = articles.stream().filter(e -> e.getYear() == year).findAny();
        return article;    }

    @Override
    public Optional<Article> findByAuthor(String author) {
        var article = articles.stream().filter(e -> e.getAuthor() == author).findAny();
        return article;
    }
}
