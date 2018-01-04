package com.aplikacjaprawnicza.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="court_departments")
public class CourtDepartment {
    
@GeneratedValue
@Id
private Long id;
private String name;

@OneToOne
private Address address;

@ManyToOne
private Court court;
    
}
