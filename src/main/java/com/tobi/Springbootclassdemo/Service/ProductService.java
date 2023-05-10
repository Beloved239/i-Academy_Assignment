package com.tobi.Springbootclassdemo.Service;

import com.tobi.Springbootclassdemo.DTO.ProductRequest;
import com.tobi.Springbootclassdemo.Repository.ProductRepository;
import com.tobi.Springbootclassdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
//    @Autowired
//    private ProductRequest productRequest;


    public ProductRequest  addProduct(ProductRequest productRequest){
        Product newProduct = new Product();

        newProduct.setName(productRequest.getName());
        newProduct.setQuantity(productRequest.getQuantity());
        newProduct.setSkuCode(productRequest.getDescription());
        newProduct.setDescription(productRequest.getDescription());

        Product savedProduct = productRepository.save(newProduct);
//        return productRepository.save(newProduct);
        ProductRequest response = new ProductRequest();

        response.setName(savedProduct.getName());
        response.setSkuCode(savedProduct.getSkuCode());
        response.setQuantity(savedProduct.getQuantity());
        response.setDescription(savedProduct.getDescription());

        return response;

    }

    public List<Product> fetchAllProducts(){
        return productRepository.findAll();
//        Object ProductRequest = new Object();
    }

    public List<ProductRequest> getAllProducts(){
        List<Product> product  = productRepository.findAll();
        ProductRequest newProduct = new ProductRequest();
        List<ProductRequest> productRequests= new ArrayList<>();


        for (Product product1:product){

            newProduct.setName(product1.getName());
            newProduct.setQuantity(product1.getQuantity());
            newProduct.setSkuCode(product1.getSkuCode());
            newProduct.setDescription(product1.getDescription());

            productRequests.add(newProduct);
        }
        return productRequests;

    }

    public Optional<Product> fetchProductById(Long productId){
        return productRepository.findById(productId);
        //Optional inbuilt class handles exceptions
    }

    public Product fetchProductsByName(String productName){

        boolean isProductExist = productRepository.existsByName(productName);

        if (isProductExist){
            return productRepository.findByName(productName);
        }else {
            return null;
        }
    }

    public Product fetchProductByDate(Long dateCreated){
        boolean isProductExists = productRepository.existsByCreatedAt(dateCreated);
        if (isProductExists){
            return productRepository.findByCreatedAt(dateCreated);
        }else {
            return null;
        }
    }



    public void deleteProduct(Long productId){
        Product product = productRepository.findById(productId).orElseThrow();
        productRepository.deleteById(productId);
    }

    public ResponseEntity <Product> updateProduct(Long productId, ProductRequest productRequest){
        Product productRequest1 = productRepository.findById(productId).orElseThrow();


        productRequest1.setName(productRequest.getName());
        productRequest1.setQuantity(productRequest.getQuantity());
        productRequest1.setSkuCode(productRequest.getSkuCode());
        productRequest1.setDescription(productRequest.getDescription());

        Product savedProduct = new Product();
        savedProduct= productRepository.save(productRequest1);
        return ResponseEntity.ok(savedProduct);
    }



}
