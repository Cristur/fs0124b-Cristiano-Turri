package it.epicode.gestione_eventi.datalayer.repositories;

import it.epicode.gestione_eventi.datalayer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UsersRepository extends JpaRepository<User, Long> {
}
