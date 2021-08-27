package com.spring.rest.system_bankpayments.service.impl;

import com.spring.rest.system_bankpayments.entity.role.Client;
import com.spring.rest.system_bankpayments.repository.ClientRepository;
import com.spring.rest.system_bankpayments.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private  ClientRepository clientRepository;

    @Override
    public List findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client save(Client object) {
        return clientRepository.save(object);
    }

    @Override
    public void delete(Client object) {
        clientRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }

}
