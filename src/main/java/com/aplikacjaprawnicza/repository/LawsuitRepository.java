package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Lawsuit;
import org.springframework.data.repository.CrudRepository;

public interface LawsuitRepository extends CrudRepository<Lawsuit, Long> {
    
}
