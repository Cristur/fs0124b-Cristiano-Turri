package it.epicode.Classes;


import jakarta.persistence.Entity;

@Entity
public class Libro extends Catalogo{
    private String autore;
    private String genere;

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Libro(){

    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", pagine=" + pagine +
                '}';
    }

    public Libro(String titolo, long anno, long pagine, String autore, String genere) {
        super(titolo, anno, pagine);
        this.autore = autore;
        this.genere = genere;
    }
}

