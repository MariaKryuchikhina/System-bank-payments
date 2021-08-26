package com.spring.rest.system_bankpayments.entity.account;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class DepositAccount {

    @Id
    private int id_deposit;

    private String number_deposit; //номер депозита

    private double amount_deposit; //сумма депозита

    private double interest_rate; //процентная ставка

    private int expiration_date; //срок действия

}
