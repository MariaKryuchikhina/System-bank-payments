package com.spring.rest.system_bankpayments.entity.role;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Client {

    @Id
    private int id_client;

    private String firstName;

    private String lastName;

    private String phone_number;

    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_deposit")
    private DepositAccount depositAccount;

}
