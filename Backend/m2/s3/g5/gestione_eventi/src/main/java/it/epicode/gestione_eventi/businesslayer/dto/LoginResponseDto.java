package it.epicode.gestione_eventi.businesslayer.dto;


import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Builder(setterPrefix = "with")
@AllArgsConstructor

public class LoginResponseDto extends DtoBase {

    private long id;
    private String username;
    private String password;
    private String email;
    private final List<String> roles;
    private String token;

}
