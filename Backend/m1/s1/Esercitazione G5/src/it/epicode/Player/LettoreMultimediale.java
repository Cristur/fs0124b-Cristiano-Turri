package it.epicode.Player;

import java.util.Scanner;

public class LettoreMultimediale {
    //IMPOSTO LA LUNGHEZZA DELL'ARRAY A UN MASSIMO DI 5
    private final Eseguibile[] eseguibili = new Eseguibile[5];


    public Eseguibile[] creaElementi() {
        //SCRITTE DI BENVENUTO
        System.out.println("Benvenuto su pirateFy!");
        System.out.println("Digita 1 se vuoi creare un Immagine");
        System.out.println("Digita 2 se vuoi creare un Video");
        System.out.println("Digita 3 se vuoi creare un Audio");

        //GENERO UN OGGETTO SCANNER DA RIUTILIZZARE
        Scanner scanner = new Scanner(System.in);

        //AVVIO UN CICLO PER CREARE 5 ELEMENTI
        for (int i = 0; i < eseguibili.length; i++) {
            System.out.print("Cosa vuoi creare? ");
            //PRENDO DA TASTIERA UN INPUT
            int numero = scanner.nextInt();
            switch (numero) {
            // IN BASE AL NUMERO SO QUALE TIPO DI OGGETTO CREARE

                //NEL PRIMO CASO CREO UN IMMAGINE
                case 1:
                    //RICEVO IN INPUT LE PROPRIETA DA FORNIRE ALL'OGGETTO
                    System.out.print("Inserisci un titolo per l'immagine: ");
                    String titolo = scanner.next();
                    scanner.nextLine();
                    System.out.print("Inserisci luminosita: ");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    eseguibili[i] = new Immagine(titolo, luminosita);
                    break;

                    //NEL SECONDO CASO CREO UN VIDEO
                case 2:
                    System.out.print("Inserisci un titolo per il video: ");
                    String titolo1 = scanner.next();
                    scanner.nextLine();
                    System.out.print("Inserisci durata: ");
                    int durata1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci volume: ");
                    int volume1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci luminosita: ");
                    int luminosita1 = scanner.nextInt();
                    scanner.nextLine();
                    eseguibili[i] = new Video(titolo1, durata1, volume1, luminosita1);
                    break;

                    //NEL TERZO CASO CREO UN AUDIO
                case 3:

                    System.out.print("Inserisci un titolo per l'audio: ");
                    String titolo2 = scanner.next();
                    scanner.nextLine();
                    System.out.print("Inserisci durata: ");
                    int durata2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci volume: ");
                    int volume2 = scanner.nextInt();
                    scanner.nextLine();
                    eseguibili[i] = new Audio(titolo2, durata2, volume2);
                    break;
            }
        }
        return eseguibili;
    }

}
