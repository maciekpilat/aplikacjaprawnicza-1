package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Client;
import com.aplikacjaprawnicza.model.domain.Event;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface EventService {

    Event findById(long id);
    
    void saveEvent(Event event);

   

}
