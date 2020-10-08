package com.vijaygenius123.learning.microservice.order.controllers;


import com.vijaygenius123.learning.microservice.order.common.Payment;
import com.vijaygenius123.learning.microservice.order.common.TransactionRequest;
import com.vijaygenius123.learning.microservice.order.common.TransactionResponse;
import com.vijaygenius123.learning.microservice.order.models.Order;
import com.vijaygenius123.learning.microservice.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create")
    public TransactionResponse createOrder(@RequestBody TransactionRequest request){

        return null;
    }

}
