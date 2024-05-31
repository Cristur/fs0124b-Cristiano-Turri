package it.epicode.gestione_eventi.datalayer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseEntity{
    @ManyToMany
    private User user;
    @ManyToMany
    private Event event;
}
