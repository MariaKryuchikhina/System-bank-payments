package com.spring.rest.system_bankpayments.entity.account;

import lombok.*;
import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepositAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDeposit;

    private String numberDeposit; //номер депозита

    private double amountDeposit; //сумма депозита

    private double interestRate; //процентная ставка

    private int expirationDate; //срок действия

    @Enumerated(EnumType.STRING)
    private TypeEnum type;

}
