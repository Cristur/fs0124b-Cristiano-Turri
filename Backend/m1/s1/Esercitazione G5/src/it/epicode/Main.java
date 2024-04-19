package it.epicode;

import it.epicode.Player.*;

public class Main {
    public static void main(String[] args) {
       // Audio audio1 = new Audio("Everlong", 5, 6);
       // Immagine img1 = new Immagine("Foto di gesu", 4);
       // Video video1 = new Video("Lontre", 5, 5, 5);
       // riproduttore(new Eseguibile[]{audio1, img1, video1});
       LettoreMultimediale p = new LettoreMultimediale();
        p.creaElementi();
    }

   // public static void riproduttore(Eseguibile[] eseguibili) {
       // System.out.print("Tutto cio che puoi vedere e ascoltare: ");
        //for (int i = 0; i < eseguibili.length; i++) {
        //    eseguibili[i].esegui();
      //  }
    }
