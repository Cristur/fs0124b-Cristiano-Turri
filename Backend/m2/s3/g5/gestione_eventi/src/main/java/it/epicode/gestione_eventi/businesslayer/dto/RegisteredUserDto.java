package it.epicode.gestione_eventi.businesslayer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(setterPrefix = "with")
@AllArgsConstructor
public class RegisteredUserDto extends DtoBase{
    private long id;
    private String username;
    private final List<String> roles;
}
