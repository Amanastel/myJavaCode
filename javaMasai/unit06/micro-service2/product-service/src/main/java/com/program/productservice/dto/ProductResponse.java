package com.program.productservice.dto;

import lombok.*;

@Data
@Builder
public class ProductResponse {

    private Integer productId;
    private String name;
    private String description;
    private Integer price;
}
