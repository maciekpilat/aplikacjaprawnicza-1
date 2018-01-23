package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Event;
import com.aplikacjaprawnicza.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public Event findById(long id) {
        return eventRepository.findOne(id);
    }

    @Override
    public void saveEvent(Event event) {
       eventRepository.save(event);
    }

}
