package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Lawsuit;
import com.aplikacjaprawnicza.repository.LawsuitRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LawsuitServiceImpl implements LawsuitService {
    
    @Autowired
    LawsuitRepository lawssuitRepository;

    @Override
    public Lawsuit findById(long id) {
     return lawssuitRepository.findOne(id);
    }

    @Override
    public void saveLawsuit(Lawsuit lawsuit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLawsuitById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lawsuit> findLawsuitByFirm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lawsuit> findLawsuitByClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lawsuit> findLawsuitByLawyer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
