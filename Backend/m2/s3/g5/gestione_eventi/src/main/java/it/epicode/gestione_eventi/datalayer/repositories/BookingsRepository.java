package it.epicode.gestione_eventi.datalayer.repositories;

import it.epicode.gestione_eventi.datalayer.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public class BookingsRepository extends JpaRepository<Booking, Long> {
}
