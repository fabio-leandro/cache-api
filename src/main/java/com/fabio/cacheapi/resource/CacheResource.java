package com.fabio.cacheapi.resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class CacheResource {

    @GetMapping
    @CacheEvict(value = "products-cache", key = "")
    public String clearCache(){
        return "Limpa o cache";
    }
}
