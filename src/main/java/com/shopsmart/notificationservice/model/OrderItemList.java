package com.shopsmart.notificationservice.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemList {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
