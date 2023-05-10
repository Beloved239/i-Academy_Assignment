package com.tobi.Springbootclassdemo.Repository;

import com.tobi.Springbootclassdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String productName);

    Boolean existsByName(String productName);

    Boolean existsByCreatedAt(Long date);

//    Product findByDate(Date date);

    Product findByCreatedAt(Long dateCreated);

}
