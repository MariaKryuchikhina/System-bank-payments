package com.spring.rest.system_bankpayments.service.impl;

import com.spring.rest.system_bankpayments.entity.account.CreditAccount;
import com.spring.rest.system_bankpayments.repository.CreditAccountRepository;
import com.spring.rest.system_bankpayments.service.CreditService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceImpl implements CreditService {

    private CreditAccountRepository creditAccountRepository;

    @Override
    public List<CreditAccount> findAll() {
        return creditAccountRepository.findAll();
    }

    @Override
    public CreditAccount findById(Long id) {
        return creditAccountRepository.findById(id).orElse(null);
    }

    @Override
    public CreditAccount save(CreditAccount object) {
        return creditAccountRepository.save(object);
    }

    @Override
    public void delete(CreditAccount object) {
        creditAccountRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        creditAccountRepository.deleteById(id);
    }
}
