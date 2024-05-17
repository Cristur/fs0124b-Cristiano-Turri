package it.epicode.gestionePrenotazioni.repositories;

import it.epicode.gestionePrenotazioni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {
}
