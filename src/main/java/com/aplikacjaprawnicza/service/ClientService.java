package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Client;
import java.util.List;

public interface ClientService {

    Client findById(long id);

    Client findByName(String name);

    void saveClient(Client client);

    void updateClient(Client client);

    void deleteClientById(long id);

    List<Client> findAllClients();

    List<Client> findByFirm();
    
    void deleteAllClients();

    boolean isClientExist(Client client);

}
