package Azienda;

import java.util.Scanner;

public class DipendentePartTime extends Dipendente{


    public DipendentePartTime(String matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
    @Override
    public double calculateSalary(){
        int ore;
        double salary;
        System.out.print("Inserisci le tue ore lavorative: ");
        ore = new Scanner(System.in).nextInt();
        salary = this.getStipendio()/ore;
        System.out.println("Questo é il tuo stipendio: " + salary);
        return salary;
    }

    @Override
    public double totalSalary() {
        return this.calculateSalary();
    }
}


