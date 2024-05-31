package it.epicode.gestione_eventi.datalayer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "events")
public class Event extends BaseEntity {
    private String location;
    private LocalDate date;
    private String name;
    private String description;
    private int seats;
    @ManyToMany(mappedBy = "event")
    private List<Booking> bookings;
}
