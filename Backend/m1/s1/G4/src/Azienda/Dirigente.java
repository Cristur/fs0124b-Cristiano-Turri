package Azienda;

public class Dirigente extends Dipendente{
    public Dirigente(String matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
    @Override
    public double calculateSalary(){
        double salary = this.getStipendio();
        System.out.println("Questo é il tuo stipendio: " + this.getMatricola() + " " + salary);
        return salary;
    }

    @Override
    public double totalSalary() {
        return this.calculateSalary();
    }
}
