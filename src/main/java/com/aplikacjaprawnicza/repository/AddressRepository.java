package com.aplikacjaprawnicza.repository;

import com.aplikacjaprawnicza.model.domain.Address;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
