package com.spring.rest.system_bankpayments.repository;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositAccountRepository extends JpaRepository<DepositAccount, Integer> {
}
