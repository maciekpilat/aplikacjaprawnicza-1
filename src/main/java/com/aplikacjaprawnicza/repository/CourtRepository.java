package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Court;
import org.springframework.data.repository.CrudRepository;

public interface CourtRepository extends CrudRepository<Court, Long>  {
    
}
