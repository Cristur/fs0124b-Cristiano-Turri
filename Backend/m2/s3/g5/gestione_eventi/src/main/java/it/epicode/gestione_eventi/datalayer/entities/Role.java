package it.epicode.gestione_eventi.datalayer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
@Table(name = "roles")
public class Role extends BaseEntity {
    @Column(length = 15, unique = true)
    String name;
    @ManyToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private final List<User> users = new ArrayList<>();
}
