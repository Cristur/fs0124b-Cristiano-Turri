package it.epicode.gestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Reservation extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDate bookingDate;
}
