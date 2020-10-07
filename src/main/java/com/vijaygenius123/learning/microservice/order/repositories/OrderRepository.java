package com.vijaygenius123.learning.microservice.order.repositories;

import com.vijaygenius123.learning.microservice.order.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
