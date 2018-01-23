package com.aplikacjaprawnicza.api.controller;

import static com.aplikacjaprawnicza.api.controller.ClientRestController.logger;
import com.aplikacjaprawnicza.model.domain.Client;
import com.aplikacjaprawnicza.model.domain.Event;
import com.aplikacjaprawnicza.service.EventService;
import com.aplikacjaprawnicza.util.CustomErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EventRestController {
    
    @Autowired
    private EventService eventService;
    
    public static final Logger logger = LoggerFactory.getLogger(EventRestController.class);
    
    @GetMapping("api/events/{id}")
    public ResponseEntity<?> getEventById(@PathVariable("id") long id){
        
         Event event = eventService.findById(id);
        
        if (event == null){
            logger.error("Unable to find event with id{}",id);
            return new ResponseEntity(new CustomErrorType("Event with id " + id + " not found."), HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<Event>(event, HttpStatus.OK);
    }
    
    @PostMapping("api/events")
    public ResponseEntity<?> createOrUpdateEvent(@RequestBody Event event){
        
         eventService.saveEvent(event);

        return new ResponseEntity<Event>(event, HttpStatus.OK);
    }
    
}
