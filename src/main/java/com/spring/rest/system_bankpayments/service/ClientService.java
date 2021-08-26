package com.spring.rest.system_bankpayments.service;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import java.util.List;

public interface ClientService {

    public List<DepositAccount> getAllInformation();

    public DepositAccount getDepositAccount(int id);

    public DepositAccount openAnDepositAccount(DepositAccount depositAccount);

    public DepositAccount wireTransfer(int id, int amount);
}
