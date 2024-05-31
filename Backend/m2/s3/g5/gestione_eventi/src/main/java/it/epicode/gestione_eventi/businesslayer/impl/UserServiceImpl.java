package it.epicode.gestione_eventi.businesslayer.impl;

import it.epicode.gestione_eventi.businesslayer.UserService;
import it.epicode.gestione_eventi.businesslayer.dto.LoginResponseDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisterUserDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisteredUserDto;
import it.epicode.gestione_eventi.config.JwtUtils;
import it.epicode.gestione_eventi.datalayer.repositories.RolesRepository;
import it.epicode.gestione_eventi.datalayer.repositories.UsersRepository;
import org.apache.catalina.User;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

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
        return null;
    }

    @Override
    public Optional<LoginResponseDto> login(String username, String password) {
        return Optional.empty();
    }

    @Override
    public Optional<RegisteredUserDto> get(long id) {
        return Optional.empty();
    }
}
