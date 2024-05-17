package it.epicode.gestionePrenotazioni.runner;

import it.epicode.gestionePrenotazioni.entities.*;
import it.epicode.gestionePrenotazioni.repositories.BuildingRepository;
import it.epicode.gestionePrenotazioni.repositories.LocationRepository;
import it.epicode.gestionePrenotazioni.repositories.ReservationRepository;
import it.epicode.gestionePrenotazioni.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
                .withFree(true)
                .withType(Type.PRIVATE)
                .withMaxOccupants(20L)
                .build());

        var reservation = reservations.save(Reservation.builder()
                .withUser(user)
                .withLocation(location)
                .withBookingDate(LocalDate.now())
                .build());


    }
}
