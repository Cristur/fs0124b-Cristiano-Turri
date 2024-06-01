package it.epicode.gestione_eventi.presentationlayer.models;

import jakarta.validation.constraints.NotNull;

public record RoleModel (
    @NotNull
    String name
)
{

}
