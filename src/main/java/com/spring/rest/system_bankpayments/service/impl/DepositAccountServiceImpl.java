package com.spring.rest.system_bankpayments.service.impl;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import com.spring.rest.system_bankpayments.repository.DepositAccountRepository;
import com.spring.rest.system_bankpayments.service.DepositAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DepositAccountServiceImpl implements DepositAccountService {

    @Autowired
    private DepositAccountRepository depositAccountRepository;

    @Override
    @Transactional
    public List<DepositAccount> findAll() {
        return depositAccountRepository.findAll();
    }

    @Override
    @Transactional
    public DepositAccount findById(Long id) {
        return depositAccountRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DepositAccount save(DepositAccount object) {
        return depositAccountRepository.save(object);
    }

    @Override
    @Transactional
    public void delete(DepositAccount object) {
        depositAccountRepository.delete(object);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        depositAccountRepository.deleteById(id);
    }
}
