package it.epicode.gestionePrenotazioni.repositories;

import it.epicode.gestionePrenotazioni.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
