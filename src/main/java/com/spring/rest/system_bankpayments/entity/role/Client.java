package com.spring.rest.system_bankpayments.entity.role;

import com.spring.rest.system_bankpayments.entity.account.DepositAccount;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    private long id_client;

    private String firstName;

    private String lastName;

    private String phone_number;

    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_deposit")
    private DepositAccount depositAccount;

}
