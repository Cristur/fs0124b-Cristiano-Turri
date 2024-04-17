package Sim;

import java.util.Arrays;

public class Sim {
   private String number;
   private int credit;
   private Calls[] lastCalls;



    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Calls[] getLastCalls() {
        return lastCalls;
    }

    public void setLastCalls(Calls[] lastCalls) {
        this.lastCalls = lastCalls;
    }
    public Sim(String n){
        number = n;
        credit = 0;
        this.lastCalls = new Calls[0];

    }
    public void stampaSim(){
        System.out.println("Questo é il numero: " + this.getNumber());
        System.out.println("Questo é il credito residuo: " + this.getCredit());
        System.out.println("Questo é l'elenco delle ultime 5 chiamate: " + Arrays.toString(this.getLastCalls()));
    }

}
