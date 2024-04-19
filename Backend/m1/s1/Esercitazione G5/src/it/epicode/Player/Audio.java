package it.epicode.Player;

public class Audio extends Riproducibile implements Eseguibile{

    public Audio(String titolo, int volume, int durata) {
       super(titolo, volume, durata);
    }


    public int abbassaVolume() throws Exception {
        //CONTROLLO CHE IL VOLUME SIA MAGGIORE DI 0 E LO DIMINUISCO

        if(this.volume>=0) {
            return this.volume--;
        }
        //ALTRIMENTI LANCIO UN ERRORE

        else {
            throw new Exception("Fai prima a spegnere");
        }
    }


    public int alzaVolume() throws Exception {
        //CONTROLLO CHE IL VOLUME SIA MINORE DI 10 E LO AUMENTO

        if(this.volume<10) {
            return this.volume++;
        }
        //ALTRIMENTI LANCIO UN ERRORE

        else {
            throw new Exception("Volume al massimo!!");
        }
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void esegui() {
        play();
    }

    //Sovrascrivo il play metodo per eseguire il brano
    @Override
    public void play(){
        //Inizializzo due stringhe vuote da riempire
        String puntiEsclamativi = "";

        //Itero per riempire la stringa di punti esclamativi
        for (int i=0; i<this.volume; i++){
            puntiEsclamativi += "!";
        }
        //Itero per stampare a schermo Titolo e Volume
        for (int i=0; i<this.durata; i++){
            System.out.println("Titolo: " + this.getTitolo() + " Volume: " + puntiEsclamativi);
        }
    }



}
