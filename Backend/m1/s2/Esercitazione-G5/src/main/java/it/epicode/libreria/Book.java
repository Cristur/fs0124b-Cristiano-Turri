package it.epicode.libreria;

public class Book extends Article {
    private String author;
    private String genre;

    public Book(String title, int ISBN, int year, int pages, String author, String genre) {
        super(title, ISBN, year, pages);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
