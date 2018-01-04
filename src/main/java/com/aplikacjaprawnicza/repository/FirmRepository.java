package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Firm;
import org.springframework.data.repository.CrudRepository;

public interface FirmRepository extends CrudRepository<Firm, Long> {
    
}
