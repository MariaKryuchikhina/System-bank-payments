package com.spring.rest.system_bankpayments.controller;

import com.spring.rest.system_bankpayments.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;



}
