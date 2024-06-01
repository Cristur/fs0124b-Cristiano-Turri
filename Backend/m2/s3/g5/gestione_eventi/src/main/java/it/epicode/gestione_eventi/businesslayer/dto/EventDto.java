package it.epicode.gestione_eventi.businesslayer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Builder(setterPrefix = "with")
@AllArgsConstructor
public class EventDto extends DtoBase{
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;

}
