package com.fabio.cacheapi.service;

import com.fabio.cacheapi.entity.Product;
import com.fabio.cacheapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    @Cacheable(cacheNames = "products-cache")
    public List<Product> getAllProducts(){
        log.info("Class: ProductService, Method: getAllProducts");
        return productRepository.findAllProducts();
    }
}
