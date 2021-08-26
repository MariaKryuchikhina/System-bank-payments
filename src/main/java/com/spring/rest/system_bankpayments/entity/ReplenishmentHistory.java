package com.spring.rest.system_bankpayments.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReplenishmentHistory {

    private long id;

    private Date transfer_date;

    private double amount;
}
