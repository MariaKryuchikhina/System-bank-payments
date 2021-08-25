package com.spring.rest.system_bankpayments.entity.account;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class DepositAccount {

    @Id
    private int id_deposit;

    private String number_deposit;

    private String amount_deposit;

    private double interestRate;

    private int expirationDate;

}
