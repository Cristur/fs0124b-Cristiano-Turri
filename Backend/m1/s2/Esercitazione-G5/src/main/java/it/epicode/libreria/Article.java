package it.epicode.libreria;

public abstract class Article {
    private Long ISBN;
    private String title;
    private int year;
    private int pages;

    public Article(String title, Long ISBN, int year, int pages) {
        this.title = title;
        this.ISBN = ISBN;
        this.year = year;
        this.pages = pages;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
