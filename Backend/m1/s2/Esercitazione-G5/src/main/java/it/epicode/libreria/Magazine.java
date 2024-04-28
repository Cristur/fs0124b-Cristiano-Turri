package it.epicode.libreria;

public class Magazine extends Article {
    private Periodicity periodicity;

    public Magazine(String title, Long ISBN, int year, int pages, Periodicity periodicity) {
        super(title, ISBN, year, pages);
        this.periodicity = periodicity;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }
    public String toString() {
        return "This is the list of our Books: [" +
                "\nISBN:" + this.getISBN() +
                "\nTitle:" + this.getTitle() +
                "\nYear:" + this.getYear() +
                "\nPages:" + this.getPages() +
                "\n Periodicity:" + periodicity +
                "\n]";
    }


}
