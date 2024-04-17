package Classi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo();
        Rettangolo rettangolo2 = new Rettangolo();
        rettangolo2.setLarghezza(10);
        rettangolo2.setAltezza(5);
        rettangolo1.setAltezza(10);
        rettangolo1.setLarghezza(20);
        System.out.println(rettangolo1.perimetro());
        stampaRettangolo(rettangolo1);
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }

    public static void stampaRettangolo(Rettangolo obj){
        System.out.println("Questa é l'area: " + obj.area() + " Questo é il perimetro: " + obj.perimetro());
    }
    public static void stampaDueRettangoli(Rettangolo obj1, Rettangolo obj2){
        int sumArea = obj1.area() + obj2.area();
        int sumPerimetro = obj1.perimetro() + obj2.perimetro();
        System.out.println("Questa é l'area del primo rettangolo: " + obj1.area() + " Questo é il perimetro del primo rettangolo: " + obj1.perimetro());
        System.out.println("Questa é l'area del secondo rettangolo: " + obj2.area() + " Questo é il perimetro del secondo rettangolo: " + obj2.perimetro());
        System.out.println("Questa é la somma delle aree: " + sumArea + " Questa é la somma dei perimetri: " + sumPerimetro);
    }
}