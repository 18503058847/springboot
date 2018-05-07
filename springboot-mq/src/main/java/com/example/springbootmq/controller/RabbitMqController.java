package com.example.springbootmq.controller;

import com.example.springbootmq.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqController {
    private static final String SUCCESS = "SUCCESS";
    private static final String FAILURE = "FAILURE";

    @Autowired
    private Producer producer;

    @GetMapping("/push")
    public String push() {
        producer.send();
        return SUCCESS;
    }
}