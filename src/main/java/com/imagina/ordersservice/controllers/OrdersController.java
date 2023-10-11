package com.imagina.ordersservice.controllers;

import com.imagina.ordersservice.services.OrdersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrdersController {

    private final OrdersService ordersService;


    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
}
