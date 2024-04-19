package it.epicode.Player;

public class Video extends Riproducibile implements Eseguibile {
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
    public int getDurata(int durata){
        return this.durata;
    }
    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    @Override
    public void esegui() {
        play();
    }


    public int abbassaVolume() throws Exception {
        //CONTROLLO CHE IL VOLUME SIA MAGGIORE DI 0 E LO DIMINUISCO

        if (this.volume > 0) {
            return this.volume--;
        }
        //ALTRIMENTI LANCIO UN ERRORE
        else {
            throw new Exception("Fai prima a spegnere");
        }
    }


    public int alzaVolume() throws Exception {
        //CONTROLLO CHE IL VOLUME SIA MINORE DI 10 E LO AUMENTO
        if (this.volume < 10) {
            return this.volume++;
        }
        //ALTRIMENTI LANCIO UN ERRORE
        else {
            throw new Exception("Volume al massimo!!");
        }
    }

    //Sovrascrivo il metodo play per eseguire il video
    @Override
    public void play() {
        //Inizializzo due stringhe vuote da riempire
        String puntiEsclamativi = "";
        String asterischi = "";

        //Itero per riempire la stringa di punti esclamativi
        for (int i = 0; i < this.volume; i++) {
            puntiEsclamativi += "!";
        }
        //Itero per riempire la stringa di asterischi
        for (int i = 0; i < this.luminosita; i++) {
            asterischi += "*";
        }
        //Itero per stampare a schermo Titolo, Volume, Luminositá
        for (int i = 0; i < this.durata; i++) {
            System.out.println("Titolo: " + this.getTitolo() + " Volume: " + puntiEsclamativi + " Luminositá: " + asterischi);
        }
    }


    public int aumentaLuminosita() throws Exception {
        if (this.luminosita >= 0) {
            return this.luminosita--;
        } else {
            throw new Exception("Fai prima a spegnere");
        }
    }


    public int diminuisciLuminosita() throws Exception {
        if (this.luminosita < 10) {
            return this.luminosita++;
        } else {
            throw new Exception("Che male agli occhi!!");
        }
    }


}
