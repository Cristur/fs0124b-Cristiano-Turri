package it.epicode.Classes;

public class Rivista extends Catalogo{
    private Periodicità periodicità;


    public Rivista() {
    }

    public Rivista(String titolo, long anno, long pagine, Periodicità periodicità) {
        super(titolo, anno, pagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }
}
