package com.fabio.cacheapi.repository;

import com.fabio.cacheapi.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
@Slf4j
public class ProductRepository {

    public List<Product> findAllProducts(){

        log.info("Class: ProductRepository, Method: findAllProducts");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        final Product p1 = Product.builder()
                .sku("product123")
                .price(new BigDecimal("10.00"))
                .description("Shirt")
                .build();

        final Product p2 = Product.builder()
                .sku("product124")
                .price(new BigDecimal("15.00"))
                .description("T-Shirt")
                .build();

        return List.of(p1,p2);
    }
}
