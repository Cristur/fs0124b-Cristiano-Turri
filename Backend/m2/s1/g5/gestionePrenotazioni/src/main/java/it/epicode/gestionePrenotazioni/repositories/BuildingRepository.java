package it.epicode.gestionePrenotazioni.repositories;

import it.epicode.gestionePrenotazioni.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository <Building, Long> {
}
