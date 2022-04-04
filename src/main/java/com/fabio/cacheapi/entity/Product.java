package com.fabio.cacheapi.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sku;
    private BigDecimal price;
    private String description;
}
