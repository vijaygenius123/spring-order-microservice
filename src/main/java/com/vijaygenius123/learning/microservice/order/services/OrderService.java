package com.vijaygenius123.learning.microservice.order.services;


import com.vijaygenius123.learning.microservice.order.models.Order;
import com.vijaygenius123.learning.microservice.order.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
