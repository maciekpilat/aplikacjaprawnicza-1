package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.EventType;
import org.springframework.data.repository.CrudRepository;

public interface EventTypeRepository extends CrudRepository<EventType, Long> {
    
}
