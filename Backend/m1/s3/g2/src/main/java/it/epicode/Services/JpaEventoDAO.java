package it.epicode.Services;

import it.epicode.Classes.Evento;

public class JpaEventoDAO extends JpaBaseDao implements EventoDAO {


    @Override
    public void Save(Evento evento) {
        try {
            log.debug("Saving {}", evento);
            var t = em.getTransaction();
            t.begin();
            em.persist(evento);
            log.debug("Before commit {}", evento);
            t.commit();
            log.debug("After commit {}", evento);
        } catch (Exception e) {
            log.error("Exception saving entity...", e);
        }
    }

    @Override
    public Evento getById(long id) {
        return em.find(Evento.class, id);
    }

    @Override
    public void delete() {

    }
}
