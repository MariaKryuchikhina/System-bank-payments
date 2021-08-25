package com.spring.rest.system_bankpayments.repository;

import com.spring.rest.system_bankpayments.entity.role.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
