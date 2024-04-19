package it.epicode.Player;

//HO CREATO UNA SECONDA CLASSE ASTRATTA CHE VERRA ESTESA DA VIDEO E AUDIO
public abstract class Riproducibile extends Multimediale {
    protected int durata;
    protected int volume;


    public Riproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    // HO CREATO UN METODO ASTRATTO PLAY CHE VERRA USATO DA ENTRAMBE LE CLASSI CHE ESTENDERANNO RIPRODUCIBILE
    public abstract void play();

}
