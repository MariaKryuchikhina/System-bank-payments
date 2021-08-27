package com.spring.rest.system_bankpayments.repository;

import com.spring.rest.system_bankpayments.entity.account.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditAccountRepository extends JpaRepository<CreditAccount, Long> {
}
