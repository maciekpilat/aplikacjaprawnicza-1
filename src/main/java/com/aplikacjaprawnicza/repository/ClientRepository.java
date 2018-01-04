package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    
}
