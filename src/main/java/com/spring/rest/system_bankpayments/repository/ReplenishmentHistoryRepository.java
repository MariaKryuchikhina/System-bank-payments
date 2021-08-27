package com.spring.rest.system_bankpayments.repository;

import com.spring.rest.system_bankpayments.entity.ReplenishmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplenishmentHistoryRepository extends JpaRepository<ReplenishmentHistory, Long> {
}
