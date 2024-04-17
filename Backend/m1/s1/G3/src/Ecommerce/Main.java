package Ecommerce;

public class Main {
    public static void main(String[] args) {
        Articolo lampada = new Articolo();
        lampada.setCodice("ab124");
        lampada.setDescrizione("questo articolo fa pena");
        lampada.setDisponibili(76);
        lampada.setPrezzo(8000);
        Cliente mario = new Cliente();
        mario.setCodice("mv1");
        mario.setEmail("mario@varano.it");
        mario.setNome("Mario");
        mario.setCognome("Varano");
        mario.setIscrizione("01/01/1200");
    }

}
