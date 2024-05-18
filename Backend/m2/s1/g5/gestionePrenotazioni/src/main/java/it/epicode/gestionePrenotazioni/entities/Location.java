package it.epicode.gestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")

public class Location extends BaseEntity{
    private String code;
    private String description;
    @Enumerated(EnumType.STRING)
    private Type type;
    private long maxOccupants;
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;
}
