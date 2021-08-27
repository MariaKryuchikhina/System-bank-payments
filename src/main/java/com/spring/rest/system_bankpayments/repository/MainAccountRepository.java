package com.spring.rest.system_bankpayments.repository;

import com.spring.rest.system_bankpayments.entity.account.MainAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainAccountRepository extends JpaRepository<MainAccount, Long> {
}
