package com.example.apidemo.repositories;

import com.example.apidemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// The Annotation, is also @Component, is considered as a Spring Bean and it will create new instance and store it in Spring IOC container
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);
}
