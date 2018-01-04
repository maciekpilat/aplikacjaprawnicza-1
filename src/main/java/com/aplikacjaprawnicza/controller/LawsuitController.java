package com.aplikacjaprawnicza.controller;

import com.aplikacjaprawnicza.model.domain.Lawsuit;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LawsuitController {
    
      public static final Logger logger = LoggerFactory.getLogger(LawsuitController.class);
      
    @GetMapping("/lawsuit/{id}")
    public ResponseEntity<?> getLawsuit(@PathVariable("id") long id) {
        return new ResponseEntity<Lawsuit>(new Lawsuit("gała"), HttpStatus.OK);
    }
    
   // @PostMapping("/lawsuit")
    
    
}
