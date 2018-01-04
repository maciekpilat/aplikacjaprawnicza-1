package com.aplikacjaprawnicza.model.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="clients")
public class Client {
@Id
@GeneratedValue
private Long id;
private String firstName;
private String lastName;
private String title;

@OneToOne(cascade = CascadeType.ALL)
private Address address;

@OneToMany(mappedBy = "client")
private List<Lawsuit> lawsuits;

    
}
