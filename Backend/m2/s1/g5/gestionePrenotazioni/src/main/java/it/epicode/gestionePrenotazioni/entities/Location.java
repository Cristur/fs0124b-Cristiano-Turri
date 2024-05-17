package it.epicode.gestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder(setterPrefix = "with")

public class Location extends BaseEntity{
    private String code;
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;
    private long maxOccupants;
    private Building building;
    private Boolean free;
}
