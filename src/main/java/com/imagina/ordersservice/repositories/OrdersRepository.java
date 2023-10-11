package com.imagina.ordersservice.repositories;

import com.imagina.ordersservice.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Order, String> {
}
