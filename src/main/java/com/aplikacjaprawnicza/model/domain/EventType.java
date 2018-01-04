package com.aplikacjaprawnicza.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_types")
public class EventType {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private String remarks;
    
    // or a list of possible next events
   // private EventType nextEvent;
    
    
}
