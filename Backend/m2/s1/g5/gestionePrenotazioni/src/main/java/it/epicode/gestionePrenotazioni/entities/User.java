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
public class User extends BaseEntity{
    private String username;
    private String firstName;
    private String email;
}
