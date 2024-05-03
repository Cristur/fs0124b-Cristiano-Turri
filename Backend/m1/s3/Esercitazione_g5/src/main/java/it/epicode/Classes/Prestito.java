package it.epicode.Classes;

import java.util.Date;

public class Prestito {
    private Utente utente;
    private Catalogo prestito;
    private Date inizioPrestito;
    private Date prevRestituzione;
    private Date restituzione;


    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Catalogo getPrestito() {
        return prestito;
    }

    public void setPrestito(Catalogo prestito) {
        this.prestito = prestito;
    }

    public Date getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(Date inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public Date getPrevRestituzione() {
        return prevRestituzione;
    }

    public void setPrevRestituzione(Date prevRestituzione) {
        this.prevRestituzione = prevRestituzione;
    }

    public Date getRestituzione() {
        return restituzione;
    }

    public void setRestituzione(Date restituzione) {
        this.restituzione = restituzione;
    }

    public Prestito(){

    }

    public Prestito(Utente utente, Catalogo prestito, Date inizioPrestito, Date prevRestituzione, Date restituzione) {
        this.utente = utente;
        this.prestito = prestito;
        this.inizioPrestito = inizioPrestito;
        this.prevRestituzione = prevRestituzione;
        this.restituzione = restituzione;
    }

}
