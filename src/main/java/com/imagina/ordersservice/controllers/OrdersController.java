package com.imagina.ordersservice.controllers;

import com.imagina.ordersservice.dto.InputOrderDto;
import com.imagina.ordersservice.dto.ReadOrderDto;
import com.imagina.ordersservice.services.OrdersService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrdersController {

    private final OrdersService ordersService;


    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping(produces = "application/json")
    public List<ReadOrderDto> findAll() {
        return ordersService.findAll();
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ReadOrderDto create(@Valid @RequestBody InputOrderDto inputOrderDto) {
        return ordersService.create(inputOrderDto);
    }
}
