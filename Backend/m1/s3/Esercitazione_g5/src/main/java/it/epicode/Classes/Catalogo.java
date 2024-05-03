package it.epicode.Classes;


import jakarta.persistence.*;

@Entity
//AVENDO SOLO LIBRI E RIVISTE HO PENSATO FOSSE PIU EFFICIENTE UNA SINGLE TABLE
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Libro/Rivista", discriminatorType = DiscriminatorType.STRING)

public abstract class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long ISBN;
    protected String titolo;
    protected long anno;
    protected long pagine;

    public Catalogo(){
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", pagine=" + pagine +
                '}';
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public long getAnno() {
        return anno;
    }

    public void setAnno(long anno) {
        this.anno = anno;
    }

    public long getPagine() {
        return pagine;
    }

    public void setPagine(long pagine) {
        this.pagine = pagine;
    }

    public Catalogo(String titolo, long anno, long pagine) {
        this.titolo = titolo;
        this.anno = anno;
        this.pagine = pagine;
    }
}



