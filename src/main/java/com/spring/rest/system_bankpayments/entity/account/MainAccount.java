package com.spring.rest.system_bankpayments.entity.account;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MainAccount {

    @Id
    private long id_main;

    private String number_main; //номер депозита

    private double amount_main; //сумма депозита

    private int expiration_date; //срок действия
}
