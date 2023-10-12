package com.imagina.ordersservice.controllers;

import com.imagina.ordersservice.dto.InputOrderDto;
import com.imagina.ordersservice.dto.ReadOrderDto;
import com.imagina.ordersservice.services.OrdersService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("orders")
public class OrdersController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

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
        log.info("Instance ID: {}", instanceId);
        return ordersService.create(inputOrderDto);
    }
}
