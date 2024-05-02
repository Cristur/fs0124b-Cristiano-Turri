package it.epicode.Services;

import it.epicode.Classes.Evento;

public interface EventoDAO {
    public void Save(Evento evento);
    public Evento getById(long id);
    public void delete();
}
