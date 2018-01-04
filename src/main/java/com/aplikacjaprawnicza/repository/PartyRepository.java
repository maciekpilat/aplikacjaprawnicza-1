package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Party;
import org.springframework.data.repository.CrudRepository;

public interface PartyRepository extends CrudRepository<Party, Long> {
    
}
