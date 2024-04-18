package Azienda;

public abstract class Dipendente implements Check {
    private String matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, int stipendio, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public abstract double calculateSalary();
    public abstract double totalSalary();

    @Override
    public void checkIn(){
        if(this instanceof Dirigente){
            System.out.println("Il tuo turno inizia alle 12");
        } else if (this instanceof DipendenteFullTime) {
            System.out.println("Il tuo turno inizia alle 10");
        } else if (this instanceof DipendentePartTime) {
            System.out.println("Il tuo turno inizia alle 8");
        }
    }
    }

