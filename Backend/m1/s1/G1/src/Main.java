import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int moltiplicazione = moltiplica(20, 30);
     System.out.println("questo e il risultato: " + moltiplicazione);
     String strConcatenata = concatena("mi piace il numero: ", 20);
     System.out.println(strConcatenata);
     String[] strConcatenata2 = concatena2(new String[]{"ciao", "mi", "chiamo", "Cristiano", "Turri"}, "we");
     System.out.println(Arrays.toString(strConcatenata2));
    }


    public static int moltiplica(int a, int b){
        int m = a*b;
        return m;
    }
    public static String concatena(String str, int b){
        String stringaConcatenata = str + b;
        return stringaConcatenata;
    }
    public static String[] concatena2(String[] a, String b){
        String[] array = new String[6];
        array[0] = a[0];
        array[1] = a[1];
        array[2] = b;
        array[3] = a[2];
        array[4] = a[3];
        array[5] = a[4];

       return array;
    }

}
