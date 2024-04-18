import Azienda.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DipendenteFullTime antonio = new DipendenteFullTime("ab1", 1200, Dipartimento.PRODUZIONE);
        DipendentePartTime andrea = new DipendentePartTime("ab2", 1199, Dipartimento.VENDITE);
        Dirigente cristiano = new Dirigente("ab3", 4000, Dipartimento.AMMINISTRAZIONE);
        Dipendente[] dipendente = {andrea, antonio, cristiano};
        stampaMatricola(dipendente);
        stampaStipendio(dipendente);
        stipendiTotali(dipendente);
        stampaTurni(dipendente);


    }
    public static void stampaMatricola(Dipendente[] dipendente){
        for(int i=0; i< dipendente.length; i++){
            System.out.println(dipendente[i].getMatricola());
        }
    }
    public static void stampaStipendio(Dipendente[] dipendente){
        for(int i=0; i< dipendente.length; i++){
            dipendente[i].calculateSalary();
        }
    }
    public static void stipendiTotali(Dipendente[] dipendente){
        double totale = 0;
        for(int i= 0; i<dipendente.length; i++){
          totale +=  dipendente[i].totalSalary();
        }
        System.out.println("Totale degli stipendi: " + totale);
    }
    public static void stampaTurni(Check[] dipendente){
        for(int i =0; i<dipendente.length; i++){
            dipendente[i].checkIn();
        }
    }
}