package it.epicode.gestione_eventi.businesslayer.impl;

import it.epicode.gestione_eventi.businesslayer.UserService;
import it.epicode.gestione_eventi.businesslayer.dto.LoginResponseDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisterUserDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisteredUserDto;
import it.epicode.gestione_eventi.businesslayer.exceptions.LoginException;
import it.epicode.gestione_eventi.businesslayer.exceptions.PersistEntityException;
import it.epicode.gestione_eventi.config.JwtUtils;
import it.epicode.gestione_eventi.datalayer.entities.Role;
import it.epicode.gestione_eventi.datalayer.repositories.RolesRepository;
import it.epicode.gestione_eventi.datalayer.repositories.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UsersRepository users;

    @Autowired
    private RolesRepository rolse;

    @Autowired
    private AuthenticationManager auth;

    @Autowired
    private JwtUtils jwt;

    @Autowired
    Mapper<RegisterUserDto, User> mapEntity;

    @Autowired
    Mapper<User, RegisteredUserDto> mapRegisteredUser;

    @Autowired
    Mapper<User, LoginResponseDto> mapLogin;


    @Override
    public Optional<User> save(User user) {
        return Optional.empty();
    }

    @Override
    public RegisteredUserDto register(RegisterUserDto user) {
        try {
            var u = mapEntity.map(user);
            var p = encoder.encode(user.getPassword());
            log.info("Password encrypted: {}", p);
            u.setPassword(p);
            if (user.getRoles() != null)
                Stream.of(user.getRoles().split(",")).forEach(r ->{
                    // Cerca il ruolo nel database con lo stesso nome
                    Role role = roles.findOneByName(r).orElse(null);
                    if (role != null) {
                        // Se il ruolo esiste già, lo aggiunge all'utente
                        u.getRoles().add(role);
                    } else {
                        throw new PersistEntityException(user);
                    }
                });
            return mapRegisteredUser.map(users.save(u));
        } catch (Exception e) {
            log.error(String.format("Exception saving user %s", user), e);
            throw new PersistEntityException(user);
        }
    }

    @Override
    public Optional<LoginResponseDto> login(String username, String password) {
        try {
            var a = auth.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            a.getAuthorities();
            SecurityContextHolder.getContext().setAuthentication(a);

            var dto = mapLogin.map(users.findOneByUsername(username).orElseThrow());
            dto.setToken(jwt.generateToken(a));
            return Optional.of(dto);
        } catch (NoSuchElementException e) {
            log.error("User not found", e);
            throw new LoginException(username, password);
        } catch (AuthenticationException e) {
            log.error("Authentication failed", e);
            throw new LoginException(username, password);
        }    }

    @Override
    public Optional<RegisteredUserDto> get(long id) {
        try {
            return Optional.of(mapRegisteredUser.map(users.findById(id).orElseThrow()));
        } catch (Exception e) {
            log.error(String.format("User not found for id %s", id), e);
            return Optional.empty();
        }
    }
}
