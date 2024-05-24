package it.epicode.gestioneDispositivi.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")

public class Device extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private DeviceType type;
    @Enumerated(EnumType.STRING)
    private DeviceStatus status;
    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

}
