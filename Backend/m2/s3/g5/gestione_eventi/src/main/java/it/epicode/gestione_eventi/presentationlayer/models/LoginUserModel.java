package it.epicode.gestione_eventi.presentationlayer.models;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record LoginUserModel(

        @NotBlank @Length(max = 125) String username,

        @NotBlank @Length(max = 15) String password
) {
}
