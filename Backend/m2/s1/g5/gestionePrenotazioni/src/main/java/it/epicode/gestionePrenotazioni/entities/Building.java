package it.epicode.gestionePrenotazioni.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder(setterPrefix = "with")

public class Building extends BaseEntity{
    private String name;
    private String address;
    private String city;
}
