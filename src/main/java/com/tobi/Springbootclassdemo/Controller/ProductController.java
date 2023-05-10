package com.tobi.Springbootclassdemo.Controller;

import com.tobi.Springbootclassdemo.DTO.ProductRequest;
import com.tobi.Springbootclassdemo.Service.ProductService;
import com.tobi.Springbootclassdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ProductRequest saveProduct(@RequestBody ProductRequest productRequest){
        return productService.addProduct(productRequest);
    }

    @GetMapping("/request")
    public List<ProductRequest> fetchProductRequest(){
        return productService.getAllProducts();
    }



    @GetMapping
    public ResponseEntity<List<Product>> fetchAllProduct(){
        productService.fetchAllProducts();
        return ResponseEntity.ok(productService.fetchAllProducts());
//        return productService.fetchAllProducts();
    }

    @GetMapping("/{productId}")
    public Optional<Product> fetchProductsById(@PathVariable(value = "productId") Long id){
        return productService.fetchProductById(id);
    }

    @GetMapping("/name")
    public Product fetchProductByName(@RequestParam(name = "name", required = true) String productName){
        return productService.fetchProductsByName(productName);
    }


    /*
    1. Update
    2. Delete
    3. search by date
     */
    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody ProductRequest productRequest){
        return productService.updateProduct(productId, productRequest);
    }



//    @PostMapping("/delete/{productId}")


    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return productId +" Deleted Successfully";
    }



    @GetMapping("/date")
    public Product fetchProductByDate(@RequestParam(name = "date", required = true) Long dateCreated){

        return productService.fetchProductByDate(dateCreated);
    }
}
