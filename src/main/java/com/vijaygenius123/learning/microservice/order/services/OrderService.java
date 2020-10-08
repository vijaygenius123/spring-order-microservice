package com.vijaygenius123.learning.microservice.order.services;


import com.vijaygenius123.learning.microservice.order.common.Payment;
import com.vijaygenius123.learning.microservice.order.common.TransactionRequest;
import com.vijaygenius123.learning.microservice.order.models.Order;
import com.vijaygenius123.learning.microservice.order.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(TransactionRequest request){
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());



        return orderRepository.save(order);
    }
}
