package it.epicode.libreria;

public class Magazine extends Article {
    private Periodicity periodicity;

    public Magazine(String title, int ISBN, int year, int pages, Periodicity periodicity) {
        super(title, ISBN, year, pages);
        this.periodicity = periodicity;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }


}
