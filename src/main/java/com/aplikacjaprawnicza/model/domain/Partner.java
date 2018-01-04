/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplikacjaprawnicza.model.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table()
public class Partner {
@Id
@GeneratedValue
private Long partnerId;	
private String partnerFirstName;	
private String partnerLastName;	
private String partnerTitle;

@OneToMany
private List<Assistant> asistants;
//@ManyToMany(mappedBy = "case")
//private Collection<Lawsuit> cases = new ArrayList<Lawsuit>();

    
}
