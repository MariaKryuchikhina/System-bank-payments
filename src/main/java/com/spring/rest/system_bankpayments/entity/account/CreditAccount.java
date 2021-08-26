package com.spring.rest.system_bankpayments.entity.account;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CreditAccount {

    @Id
    private int id_credit;

    private String number_credit; //номер кредита

    private double credit_limit; //кредитный лимит

    private double interest_rate; //процентная ставка

    private double current_debt; //текущая задолженность

    private double accrued_interest; //начисленные проценты

    private int expiration_date; //срок действия
}
