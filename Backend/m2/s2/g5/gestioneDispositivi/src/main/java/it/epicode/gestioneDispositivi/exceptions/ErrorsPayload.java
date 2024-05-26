package it.epicode.gestioneDispositivi.exceptions;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class ErrorsPayload {
    private String message;
    private LocalDateTime timestamp;
}
