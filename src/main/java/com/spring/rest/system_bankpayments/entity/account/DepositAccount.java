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
    private long id_deposit;

    private String number_deposit; //номер депозита

    private double amount_deposit; //сумма депозита

    private double interest_rate; //процентная ставка

    private int expiration_date; //срок действия

}
