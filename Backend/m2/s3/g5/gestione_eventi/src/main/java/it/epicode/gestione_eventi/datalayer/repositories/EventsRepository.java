package it.epicode.gestione_eventi.datalayer.repositories;

import it.epicode.gestione_eventi.datalayer.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public class EventsRepository extends JpaRepository<Event, Long> {
}
