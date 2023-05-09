package com.tobi.Springbootclassdemo.Service;

import com.tobi.Springbootclassdemo.DTO.ProductRequest;
import com.tobi.Springbootclassdemo.Repository.ProductRepository;
import com.tobi.Springbootclassdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


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
    }


}
