package com.tobi.Springbootclassdemo.DTO;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private int quantity;
    private String skuCode;
    private String description;

}
