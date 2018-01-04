package com.aplikacjaprawnicza.controller;

import com.aplikacjaprawnicza.model.domain.Client;
import com.aplikacjaprawnicza.model.domain.Lawsuit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    public static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    
    
    
    @GetMapping("/client/{id}")
    public ResponseEntity<?> getClientById(@PathVariable("id") long id) {
        return new ResponseEntity<Client>(new Client(), HttpStatus.OK);
    }
    
    @DeleteMapping("/client/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") long id) {
        logger.info("Fetching & Deleting Client with id {}", id);
 
//        User user = userService.findById(id);
//        if (user == null) {
//            logger.error("Unable to delete. User with id {} not found.", id);
//            return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
//                    HttpStatus.NOT_FOUND);
//        }
//        userService.deleteUserById(id);
//        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
return null;
    }

}
