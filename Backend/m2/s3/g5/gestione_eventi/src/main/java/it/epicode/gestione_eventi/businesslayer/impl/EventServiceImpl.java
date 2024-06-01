package it.epicode.gestione_eventi.businesslayer.impl;

import it.epicode.gestione_eventi.businesslayer.EventService;
import it.epicode.gestione_eventi.datalayer.repositories.EventsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.events.Event;

@Service
@Slf4j
public class EventServiceImpl implements EventService {
    @Autowired
    EventsRepository events;




    @Override
    public Event createEvent(Event event) {
        try {
            return events.save(event);
        } catch (Exception e) {
            log.error("Exception occurred while creating event", e);
            throw new RuntimeException("Error creating event");
        }
    }
}
