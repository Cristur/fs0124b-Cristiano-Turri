package it.epicode.gestione_eventi.businesslayer.dto;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Builder(setterPrefix = "with")
@AllArgsConstructor

public class RegisterUserDto extends DtoBase{
    private String username;
    private String password;
    private String roles;
}
