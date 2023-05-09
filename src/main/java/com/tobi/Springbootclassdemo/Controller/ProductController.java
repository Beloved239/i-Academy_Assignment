package com.tobi.Springbootclassdemo.Controller;

import com.tobi.Springbootclassdemo.DTO.ProductRequest;
import com.tobi.Springbootclassdemo.Service.ProductService;
import com.tobi.Springbootclassdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ProductRequest saveProduct(@RequestBody ProductRequest productRequest){
        return productService.addProduct(productRequest);
    }



    @GetMapping
    public ResponseEntity<List<Product>> fetchAllProduct(){
        return ResponseEntity.ok(productService.fetchAllProducts());
//        return productService.fetchAllProducts();
    }

}
