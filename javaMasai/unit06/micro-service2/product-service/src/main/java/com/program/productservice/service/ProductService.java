package com.program.productservice.service;


import com.program.productservice.dto.ProductRequest;
import com.program.productservice.dto.ProductResponse;
import com.program.productservice.model.Product;
import com.program.productservice.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private  ProductRepo productRepo;

    public Product createProductP(Product productRequest){
//        Product product = Product.builder()
//                .name(productRequest.getName())
//                .description(productRequest.getDescription())
//                .price(productRequest.getPrice()).build();

        productRepo.save(productRequest);
//        log.info("product {} is saved : ",productRequest.getId());
        return productRequest;
    }

//    public ProductRequest createProduct(ProductRequest productRequest){
//        Product product = Product.builder()
//                .name(productRequest.getName())
//                .description(productRequest.getDescription())
//                .price(productRequest.getPrice()).build();
//
//        productRepo.save(product);
////        log.info("product {} is saved : ",product.getId());
//        return productRequest;
//    }

//    public List<ProductResponse> getAllProduct(){
//        List<Product> products = productRepo.findAll();
//        return products.stream().map(this::mapToProductResponse).toList();
//
//    }

    public List<Product> getAllProduct(){
//        List<Product> products = productRepo.findAll();
//        return products.stream().map(this::mapToProductResponse).toList();
//
        return productRepo.findAll();
    }

//    private ProductResponse mapToProductResponse(Product product) {
//        return ProductResponse.builder()
//                .productId(product.getProductId())
//                .name(product.getName())
//                .description(product.getDescription())
//                .price(product.getPrice()).build();
//    }

}
