//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int moltiplicazione = moltiplica(20, 30);
     System.out.println("questo e il risultato: " + moltiplicazione);
     String strConcatenata = concatena("mi piace il numero: ", 20);
     System.out.println(strConcatenata);
     String[] strConcatenata2 = concatena2(new String[]{"ciao", "mi", "chiamo", "Cristiano", "Turri"}, "we");
     System.out.println(strConcatenata2);

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
        String[] array = new String[]{a[0], a[1], a[2], a[3], a[4]};
       return array;
    }
}
