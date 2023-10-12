package com.imagina.ordersservice.services;

import com.imagina.ordersservice.dto.InputOrderDto;
import com.imagina.ordersservice.dto.ReadOrderDto;
import com.imagina.ordersservice.dto.ReadOrderItemDto;
import com.imagina.ordersservice.entities.Order;
import com.imagina.ordersservice.repositories.OrdersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    private final ModelMapper modelMapper;

    public OrdersService(OrdersRepository ordersRepository, ModelMapper modelMapper) {
        this.ordersRepository = ordersRepository;
        this.modelMapper = modelMapper;
    }

    public List<ReadOrderDto> findAll() {
        return ordersRepository
                .findAll()
                .stream()
                .map(order -> modelMapper.map(order, ReadOrderDto.class)).collect(Collectors.toList());
    }

    public ReadOrderDto create(InputOrderDto inputOrderDto) {
        var order = modelMapper.map(inputOrderDto, Order.class);
        ordersRepository.save(order);
        return modelMapper.map(order, ReadOrderDto.class);
    }
}
