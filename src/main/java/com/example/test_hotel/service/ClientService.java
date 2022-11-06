package com.example.test_hotel.service;

import com.example.test_hotel.model.Client;
import com.example.test_hotel.repostiry.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
    public void addClient(Client client){
        this.clientRepository.save(client);
    }
    public List<Client> make(){
        return clientRepository.findAll().stream()
                .filter(client-> client.getId()<10)
                .collect(Collectors.toList());

    }


}



