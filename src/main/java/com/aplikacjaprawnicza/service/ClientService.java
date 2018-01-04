package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Client;
import java.util.List;
import org.springframework.stereotype.Service;


public interface ClientService {

    Client findById(long id);

    Client findByName(String name);

    void saveClient(Client client);

    void updateClient(Client client);

    void deleteClientById(Long id);

    List<Client> findAllClients();

    List<Client> findByFirm();

    void deleteAllClients();

    boolean isClientExist(Client client);

}
