package com.spring.rest.system_bankpayments.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Controller {

    @GetMapping
    public ResponseEntity getClient(){
        return ResponseEntity.ok("Server ok");
    }
}
