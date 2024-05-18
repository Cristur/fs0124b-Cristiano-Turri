package it.epicode.gestionePrenotazioni.repositories;

import it.epicode.gestionePrenotazioni.entities.Location;
import it.epicode.gestionePrenotazioni.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByTypeAndBuildingCity(Type type, String city);


}
