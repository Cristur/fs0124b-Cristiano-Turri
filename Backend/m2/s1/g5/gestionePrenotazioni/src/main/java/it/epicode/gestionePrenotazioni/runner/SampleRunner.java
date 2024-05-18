package it.epicode.gestionePrenotazioni.runner;

import it.epicode.gestionePrenotazioni.entities.*;
import it.epicode.gestionePrenotazioni.repositories.BuildingRepository;
import it.epicode.gestionePrenotazioni.repositories.LocationRepository;
import it.epicode.gestionePrenotazioni.repositories.ReservationRepository;
import it.epicode.gestionePrenotazioni.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;

@Component
public class SampleRunner implements CommandLineRunner {

    @Autowired
    UserRepository users;
    @Autowired
    LocationRepository locations;
    @Autowired
    BuildingRepository buildings;
    @Autowired
    ReservationRepository reservations;

    @Override
    public void run(String... args) throws Exception {

        var user = users.save(User.builder()
                .withFirstName("Cristiano")
                .withUsername("Dio")
                .withEmail("iosono@dio.it")
                .build());

        var building = buildings.save(Building.builder()
                .withName("Building 1")
                .withAddress("Cristianos Street")
                .withCity("New York")
                .build());

        var location = locations.save(Location.builder()
                .withBuilding(building)
                .withCode("13#L4c")
                .withDescription("Best building")
                .withType(Type.PRIVATE)
                .withMaxOccupants(20L)
                .build());



        try {

            //le prime due istanze vengono create
            reserve(user, location, LocalDate.of(2024,5,20));
            reserve(user, location, LocalDate.now());

            //questa istanza invece no avendo la stessa data della precedente
            reserve(user, location, LocalDate.now());


        } catch (Exception e) {
            System.err.println("Failed to reserve location: " + e.getMessage());
        }


    }


    public void reserve(User user, Location location, LocalDate date) throws Exception {

        //controllo che i parametri inseriti esistano
        Objects.requireNonNull(user, "User cannot be null");
        Objects.requireNonNull(location, "Location cannot be null");
        Objects.requireNonNull(date, "Date cannot be null");

        //creo una variabile booleana per controllare che la location non sia giá prenotata
        boolean isAlreadyReserved = reservations.findByLocation(location).stream()
                .anyMatch(r -> r.getBookingDate().equals(date));

        //lancio un eccezione se é giá prenotata
        if (isAlreadyReserved) {
            throw new Exception("The location is already reserved for the specified date.");
        }
        //lancio un eccezione se l'utente ha giá una prenotazione per quella data
        if (reservations.findReservationByUserAndDate(user,date)){
            throw new Exception("The User already has a reservation for this date");
        }

        //se é tutto corretto creo una nuova prenotazione
                reservations.save(Reservation.builder()
                        .withUser(user)
                        .withLocation(location)
                        .withBookingDate(date)
                        .build());
            }
}
