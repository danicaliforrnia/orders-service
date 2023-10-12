package com.imagina.ordersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadOrderItemDto {
    private String productName;
    private Integer units;
    private Double price;
}
