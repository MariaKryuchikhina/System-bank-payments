package com.spring.rest.system_bankpayments.entity.account;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreditAccount {

    @Id
    private long id_credit;

    private String number_credit; //номер кредита

    private double credit_limit; //кредитный лимит

    private double interest_rate; //процентная ставка

    private double current_debt; //текущая задолженность

    private double accrued_interest; //начисленные проценты

    private int expiration_date; //срок действия
}
