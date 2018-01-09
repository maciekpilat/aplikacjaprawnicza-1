package com.aplikacjaprawnicza.model.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_type_id")

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
    @JsonBackReference // removes lawsuit nested object from json 
    private Lawsuit lawsuit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getEventDate() {
        return eventDate;
    }

    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Party getParties() {
        return parties;
    }

    public void setParties(Party parties) {
        this.parties = parties;
    }

    public Lawsuit getLawsuit() {
        return lawsuit;
    }

    public void setLawsuit(Lawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

}
