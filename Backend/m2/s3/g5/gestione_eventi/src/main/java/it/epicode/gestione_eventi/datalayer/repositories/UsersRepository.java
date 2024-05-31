package it.epicode.gestione_eventi.datalayer.repositories;

import it.epicode.gestione_eventi.datalayer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class UsersRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByUsername(String username);
    Optional<User> findOneByUsernameAndPassword(String username, String password);

}
