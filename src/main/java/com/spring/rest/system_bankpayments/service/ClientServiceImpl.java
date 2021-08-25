package com.spring.rest.system_bankpayments.service;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import com.spring.rest.system_bankpayments.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<DepositAccount> getAllInformation() {
        return null;
    }

    @Override
    public DepositAccount openAnDepositAccount(DepositAccount depositAccount) {
        return null;
    }

    @Override
    public DepositAccount wireTransfer(int id, int amount) {
        return null;
    }
}
