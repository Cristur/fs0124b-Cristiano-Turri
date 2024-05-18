package it.epicode.gestionePrenotazioni.repositories;

import it.epicode.gestionePrenotazioni.entities.Location;
import it.epicode.gestionePrenotazioni.entities.Reservation;
import it.epicode.gestionePrenotazioni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("SELECT COUNT(r) > 0 FROM Reservation r WHERE r.user = :user AND r.bookingDate = :date")
    Boolean findReservationByUserAndDate(@Param("user") User user, @Param("date") LocalDate date);

    List<Reservation> findByLocation(Location location);
}
