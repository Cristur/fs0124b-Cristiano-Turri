package it.epicode.gestione_eventi.businesslayer;

import it.epicode.gestione_eventi.businesslayer.dto.LoginResponseDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisterUserDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisteredUserDto;
import it.epicode.gestione_eventi.datalayer.entities.User;

import java.util.Optional;

public interface UserService {

    Optional<User> save(User user);

    RegisteredUserDto register(RegisterUserDto user);

    Optional<LoginResponseDto> login(String username, String password);

    Optional<RegisteredUserDto> get(long id);

}
