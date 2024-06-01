package it.epicode.gestione_eventi.config;

import it.epicode.gestione_eventi.businesslayer.dto.LoginResponseDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisterUserDto;
import it.epicode.gestione_eventi.businesslayer.dto.RegisteredUserDto;
import it.epicode.gestione_eventi.datalayer.entities.User;
import org.apache.catalina.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfigJava {

    @Bean
    @Scope("singleton")
    Mapper<RegisterUserDto, User> mapRegisterUser2UserEntity() {
        return (input) -> User.builder() //
                .withPassword(input.getPassword()) //
                .withUsername(input.getUsername()) //
                .build();
    }

    @Bean
    @Scope("singleton")
    Mapper<User, RegisteredUserDto> mapUserEntity2RegisteredUser() {
        return (input) -> RegisteredUserDto.builder() //
                .withId(input.getId()) //
                .withUsername(input.getUsername()) //
                .withRoles(input.getRoles().stream().map(r -> r.getName()).toList()) //
                .build();
    }

    @Bean
    @Scope("singleton")
    Mapper<User, LoginResponseDto> mapUserEntity2LoginResponse() {
        return (input) -> LoginResponseDto.builder() //
                .withId(input.getId()) //
                .withUsername(input.getUsername()) //
                .withRoles(input.getRoles().stream().map(r -> r.getName()).toList()) //
                .build();
    }
}
