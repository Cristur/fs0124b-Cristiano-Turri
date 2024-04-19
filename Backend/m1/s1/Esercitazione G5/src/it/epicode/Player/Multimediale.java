package it.epicode.Player;
//HO CREATO UNA CLASSE ASTRATTA DA CUI POI LE SOTTOCLASSI EREDITERANNO LA PROPRIETA TITOLO
public abstract class Multimediale {
    protected String titolo;

    public Multimediale(String titolo) {
        this.titolo = titolo;
    }
}
