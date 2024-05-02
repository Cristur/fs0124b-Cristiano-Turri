package it.epicode;


import it.epicode.Classes.Evento;
import it.epicode.Services.EventoDAO;
import it.epicode.Services.JpaEventoDAO;

public class Main {
    public static void main(String[] args) {

        Evento evento1 = new Evento();
        EventoDAO eventoDAO1 = new JpaEventoDAO();
    }
}