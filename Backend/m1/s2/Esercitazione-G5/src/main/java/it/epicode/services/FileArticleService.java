package it.epicode.services;

import ch.qos.logback.core.rolling.helper.FileStoreUtil;
import it.epicode.libreria.Article;
import it.epicode.libreria.Book;
import it.epicode.libreria.Magazine;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FileArticleService implements ArticleService {


    private static final Logger logger = LoggerFactory.getLogger(FileArticleService.class);
    private static final String STORAGE = "./Articles.my";

    private static final ArrayList<Article> articles = new ArrayList<>();

    public void save() {
        File f = new File(STORAGE);
        try {
            FileUtils.delete(f);
        } catch (IOException err) {
            IOException e = err;
            logger.error("Eccezione durante l'eliminazione", e);
        }
        articles.forEach(e -> {
            try {
                if (e instanceof Book) {
                    // Se l'elemento è un libro, scrive le informazioni del libro
                    var lines = List.of(e.getISBN().toString() + "," + e.getTitle() + "," + ((Book) e).getGenre() + "," + e.getPages() + "," + ((Book) e).getAuthor() + "," + e.getYear());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines, true);

                } else if (e instanceof Magazine) {
                    // Se l'elemento è una rivista, scrive le informazioni della rivista
                    var lines = List.of(e.getISBN().toString() + "," + e.getTitle() + "," + e.getYear() + "," + e.getPages() + "," + ((Magazine) e).getPeriodicity());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines, true);
                }

            } catch (IOException exception) {
                logger.error("Exception:", exception);
            }
        });
    }

    public void load() throws IOException{
        File f = new File(STORAGE);
        List<String> lines = FileUtils.readLines(f, StandardCharsets.ISO_8859_1);
        for (String line : lines) {
            String[] properties =line.split(",");
            if(parts.lenght == 6){
                try{
                    articles.add(new Book(properties[1], Integer.parseInt(properties[2]), Integer.parseInt(properties[3]), properties[4], properties[5]));
                }
            }
        }
    }


    @Override
    public void addArticle(Article article) {
        articles.add(article);
        save();
    }

    @Override
    public void deleteArticleByISBN(Long ISBN) {
        var article = articles.stream().filter(e -> e.getISBN() == ISBN).findAny();
        if (article.isPresent()) {
            articles.remove(article);
            save();
        }
    }

    @Override
    public Optional<Article> findByISBN(Long ISBN) {
        return articles.stream().filter(e -> e.getISBN() == ISBN).findAny();
    }

    @Override
    public List<Article> findByYear(int year) {
        return articles.stream().filter(e -> e.getYear() == year).toList();
    }

    @Override
    public List<Article> findByAuthor(String author) {
        return articles.stream().filter(e -> e instanceof Book && ((Book) e).getAuthor().equals(author)).toList();
    }

    @Override
    public ArrayList<Article> getArticles() {
        return articles;
    }
}
