package com.aplikacjaprawnicza.controller;

import com.aplikacjaprawnicza.util.CustomErrorType;
import com.aplikacjaprawnicza.model.domain.Client;
import com.aplikacjaprawnicza.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    
    @Autowired
    ClientService clientService;

    public static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    
    
    
    @GetMapping("/client/{id}")
    public ResponseEntity<?> getClientById(@PathVariable("id") long id) {
        
        Client client = clientService.findById(id);
        
        if (client == null){
            logger.error("Unable to find client with id{}",id);
            return new ResponseEntity(new CustomErrorType("Client with id " + id + " not found."), HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }
    
    @PostMapping("/client")
     public ResponseEntity<?> createClient(@RequestBody Client client) {
        System.out.println("POST klient!");
        
       clientService.saveClient(client);
        
        return new ResponseEntity<String>(client.getId().toString(), HttpStatus.OK);
    }
    
    
    
    
    @DeleteMapping("/client/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") long id) {
        logger.info("Fetching & Deleting Client with id {}", id);
 
       Client client  = clientService.findById(id);
      if (client == null) {
         logger.error("Unable to delete. Client with id {} not found.", id);
           return new ResponseEntity(new CustomErrorType("Unable to delete. Client with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
       }
        clientService.deleteClientById(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
