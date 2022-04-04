package com.fabio.cacheapi.resource;

import com.fabio.cacheapi.entity.Product;
import com.fabio.cacheapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Slf4j
public class ProductResource {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        log.info("Class: ProductResource, Method: getAllProducts");
        return productService.getAllProducts();
    }
}
