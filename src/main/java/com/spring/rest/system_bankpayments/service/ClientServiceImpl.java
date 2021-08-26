package com.spring.rest.system_bankpayments.service;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import com.spring.rest.system_bankpayments.repository.ClientRepository;
import com.spring.rest.system_bankpayments.repository.DepositAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private DepositAccountRepository depositAccountRepository;

    @Override
    public List<DepositAccount> getAllInformation() {

        return depositAccountRepository.findAll();
    }

    @Override
    public DepositAccount getDepositAccount(long id) {
        return null;
    }

    @Override
    public DepositAccount openAnDepositAccount(DepositAccount depositAccount) {
        return null;
    }

    @Override
    public DepositAccount wireTransfer(long id, double amount) {
        return null;
    }

    @Override
    public void deleteDepositAccount(long id) {
        depositAccountRepository.deleteById(id);
    }
}
