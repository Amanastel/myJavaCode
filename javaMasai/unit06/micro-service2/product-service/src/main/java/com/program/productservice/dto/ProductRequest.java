package com.program.productservice.dto;

import lombok.*;

import javax.persistence.Entity;

@Data
@Builder
public class ProductRequest {

    private String name;
    private String description;
    private Integer price;
}
