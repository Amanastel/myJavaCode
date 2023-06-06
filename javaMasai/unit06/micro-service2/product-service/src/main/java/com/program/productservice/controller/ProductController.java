package com.program.productservice.controller;


import com.program.productservice.dto.ProductRequest;
import com.program.productservice.dto.ProductResponse;
import com.program.productservice.model.Product;
import com.program.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product productRequest){
        return new ResponseEntity<>(productService.createProductP(productRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);

    }
}
