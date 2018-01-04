package com.aplikacjaprawnicza.service;

import com.aplikacjaprawnicza.model.domain.Client;
import com.aplikacjaprawnicza.model.domain.Event;
import java.util.List;

public interface EventService {

    Event findById(long id);

    Client findByName(String name);

    void saveClient(Client client);

    void updateClient(Client client);

    void deleteClientById(long id);

    List<Client> findAllClients();

    void deleteAllClients();

    boolean isClientExist(Client client);

}
