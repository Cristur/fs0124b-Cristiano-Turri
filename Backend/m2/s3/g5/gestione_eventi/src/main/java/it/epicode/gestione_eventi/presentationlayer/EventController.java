package it.epicode.gestione_eventi.presentationlayer;


import it.epicode.gestione_eventi.businesslayer.EventService;
import it.epicode.gestione_eventi.businesslayer.UserService;
import it.epicode.gestione_eventi.datalayer.entities.Event;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event, Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            if (userService.hasRole(username, "EventManager")) {
                Event createdEvent = eventService.createEvent(event);
                return ResponseEntity.status(HttpStatus.CREATED).body(createdEvent);
            } else {
                // L'utente non ha il ruolo richiesto, restituisci un errore 403 Forbidden
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
        } else {
            // L'utente non è autenticato, restituisci un errore 401 Unauthorized
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
