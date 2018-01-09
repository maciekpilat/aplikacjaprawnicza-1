package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Event;
import org.springframework.data.repository.CrudRepository;


public interface EventRepository extends CrudRepository<Event, Long> {
    
}
