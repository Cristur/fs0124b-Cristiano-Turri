package it.epicode.gestione_eventi.businesslayer.exceptions;

import org.hibernate.service.spi.ServiceException;

import java.io.Serial;

public class LoginException extends ServiceException {
    @Serial
    private static final long serialVersionUID = 1
    public final String username;
    public final String password;

    public LoginException(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
}
