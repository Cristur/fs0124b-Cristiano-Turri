package it.epicode.Player;

public class Immagine extends Multimediale implements Eseguibile {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;

    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    //FACCIO L'OVERRIDE DEL METODO ESEGUI COMUNE A TUTTE E TRE LE CLASSI
    @Override
    public void esegui() {
        show();
    }

    //HO CREATO IL METODO SHOW PER RIPRODURRE L'IMMAGINE
    public void show() {
        //INIZIALIZZO UNA STRINGA VUOTA DA RIEMPIRE
        String asterischi = "";

        //ITERO PER RIEMPIRE LA STRINGA DI ASTERISCHI
        for (int i = 0; i < this.luminosita; i++) {
            asterischi += "*";
        }
        System.out.println("Titolo: " + this.getTitolo() + " Luminositá: " + asterischi);
    }


    public int aumentaLuminosita() throws Exception {
        //CONTROLLO CHE LA LUMINOSITA INSERITA SIA MAGGIORE A 0 E LA AUMENTO
        if (this.luminosita >= 0) {
            return this.luminosita--;
        }
        //ALTRIMENTI LANCIO UN ERRORE
        else {
            throw new Exception("Fai prima a spegnere");
        }
    }


    public int diminuisciLuminosita() throws Exception {
        //CONTROLLO CHE LA LUMINOSITA INSERITA SIA MINORE A 10 E LA DIMINUISCO
        if (this.luminosita < 10) {
            return this.luminosita++;
        }
        //ALTRIMENTI LANCIO UN ERRORE
        else {
            throw new Exception("Che male agli occhi!!");
        }
    }
}
