package com.spring.rest.system_bankpayments.service.impl;

import com.spring.rest.system_bankpayments.entity.account.MainAccount;
import com.spring.rest.system_bankpayments.repository.MainAccountRepository;
import com.spring.rest.system_bankpayments.service.MainAccountService;

import java.util.List;

public class MainAccountServiceImpl implements MainAccountService {

    private MainAccountRepository mainAccountRepository;

    @Override
    public List<MainAccount> findAll() {
        return mainAccountRepository.findAll();
    }

    @Override
    public MainAccount findById(Long id) {
        return mainAccountRepository.findById(id).orElse(null);
    }

    @Override
    public MainAccount save(MainAccount object) {
        return mainAccountRepository.save(object);
    }

    @Override
    public void delete(MainAccount object) {
        mainAccountRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        mainAccountRepository.deleteById(id);
    }
}
