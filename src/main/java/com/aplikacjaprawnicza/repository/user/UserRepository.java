package com.aplikacjaprawnicza.repository.user;

import com.aplikacjaprawnicza.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
    
  //  void registerNewAdminAndFirm(String email, String password);
    
}
