package com.aplikacjaprawnicza.api.controller;

import static com.aplikacjaprawnicza.api.controller.ClientRestController.logger;
import com.aplikacjaprawnicza.model.domain.Client;
import com.aplikacjaprawnicza.model.domain.Lawsuit;
import com.aplikacjaprawnicza.service.LawsuitService;
import com.aplikacjaprawnicza.util.CustomErrorType;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LawsuitRestController {
    
    @Autowired 
    LawsuitService lawsuitService;
    
      public static final Logger logger = LoggerFactory.getLogger(LawsuitRestController.class);
      
    @GetMapping("api/lawsuits/{id}")
    public ResponseEntity<?> getLawsuit(@PathVariable("id") long id) {
        
            Lawsuit lawsuit = lawsuitService.findById(id);
        
        if (lawsuit == null){
            logger.error("Unable to find lawsuit with id{}",id);
            return new ResponseEntity(new CustomErrorType("Lawsuit with id " + id + " not found."), HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<>(lawsuit, HttpStatus.OK);
        
        
    }
    
   // @PostMapping("/lawsuit")
    
    
}
