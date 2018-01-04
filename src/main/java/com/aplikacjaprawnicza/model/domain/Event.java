package com.aplikacjaprawnicza.model.domain;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Event {
@Id
@GeneratedValue
private Long id;

@ManyToOne
@JoinColumn(name="event_type_id")
private EventType eventType;

private String description;

private Timestamp eventDate;
private Timestamp createdAt;

@OneToMany(mappedBy = "event")
private List<Document> documents;

@ManyToOne
private Party parties;

@ManyToOne
@JoinColumn(name = "lawsuit_id")
private Lawsuit lawsuit;

    
}
