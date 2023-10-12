package com.imagina.ordersservice.dto;

import com.imagina.ordersservice.entities.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadOrderDto {
    private String id;
    private String userFirstName;
    private String userLastName;
    private String address;
    private List<OrderItem> orderItems;
}
