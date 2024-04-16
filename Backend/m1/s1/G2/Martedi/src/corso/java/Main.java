package corso.java;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println(stringaPariDispari("ciao"));
    System.out.println(annoBisestile(3));
    numeroCompreso();
    }
    public static boolean stringaPariDispari(String str){
        boolean b = false;
        if(str.length()%2 == 0){
            return b = true;

        }
        else{
            return b;
        }
    }
    public static boolean annoBisestile(int anno){
        boolean b = false;
        if(anno % 4 == 0){
            return b = true;
        } else if (anno % 100 == 0 && anno % 400 == 0) {
            return b = true;
        }
        else{
            return b;
        }
    }
    public static void numeroCompreso(){
        String[] str = {"zero", "uno", "due", "tre"};
        System.out.print("Inserisci un numero compreso tra 0 e 3: ");
        int numero = new Scanner(System.in).nextInt();
        switch (numero){
            case 0:
                System.out.println(str[0]);
                break;
            case 1:
                System.out.println(str[1]);
                break;
            case 2:
                System.out.println(str[2]);
                break;
            case 3:
                System.out.println(str[3]);
            default:
                throw new IllegalStateException("Invalid number: " + numero);
        }
    }
    public static String [] stringToChar(){
        System.out.println("Scrivi una frase: ");
        String str = new Scanner(System.in).next();

    }
}