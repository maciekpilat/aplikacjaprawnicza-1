package com.aplikacjaprawnicza.model.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lawsuits")
public class Lawsuit {
@Id
@GeneratedValue
private Long id;
private String title;
private Date startDate;
private Date endDate;

@ManyToOne
@JoinColumn(name = "client_id")
private Client client;

@ManyToOne
@JoinColumn(name = "firm_id")
private Firm firm;


//@ManyToMany(mappedBy = "parties")
//private Collection<Parties> parties = new ArrayList<Parties>();


//@ManyToMany()
//private Collection<Partner> partners = new ArrayList<Partner>();
//@ManyToMany()
//private Collection<Assistant> asistants = new ArrayList<Assistant>();

//@ManyToOne
//private Court court;

@OneToMany(mappedBy = "lawsuit")
private List <Event> events;

    public Lawsuit() {
    }



    public Lawsuit(String title) {
        this.title = title;
    }






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

  


    
}
