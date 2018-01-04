package com.aplikacjaprawnicza.model.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="courts")
public class Court {
    
@Id
@GeneratedValue
private Long id;
private String name;

@OneToMany
private List<CourtDepartment> courtDepartments;

}
