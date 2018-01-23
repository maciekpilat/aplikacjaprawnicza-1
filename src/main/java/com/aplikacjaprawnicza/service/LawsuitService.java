package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Lawsuit;
import java.util.List;


public interface LawsuitService {
    
 
    Lawsuit findById(long id);

    void saveLawsuit(Lawsuit lawsuit);

    void deleteLawsuitById(Long id);

    List<Lawsuit> findLawsuitByFirm();
    
    List<Lawsuit> findLawsuitByClient();
    
     List<Lawsuit> findLawsuitByLawyer();


    
    
    
}
