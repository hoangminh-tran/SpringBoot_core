package com.example.apidemo.controller;

import com.example.apidemo.models.Product;
import com.example.apidemo.models.ResponseObject;
import com.example.apidemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductController {
    //Spring IOC container inject Dependency using field injection
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getAllProducts")
    List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    ResponseEntity<ResponseObject> findById(@PathVariable("id") Long id)
    {
        Optional<Product> product = productRepository.findById(id);
        return product.isPresent() ? new ResponseEntity<>(new ResponseObject("OK", "Query product Successfully", product), HttpStatus.OK)
                : new ResponseEntity<>(new ResponseObject("NOT_FOUND", "Can not find the product with id: " +  id, ""), HttpStatus.NOT_FOUND);
    }

    @PostMapping("/insertNewProducts")
    ResponseEntity<ResponseObject> insertProduct(@RequestBody Product newProduct)
    {
        List<Product> list = productRepository.findByProductName(newProduct.getProductName().trim());
        return (list.size() <= 0) ? new ResponseEntity<>(new ResponseObject("OK", "Query product Successfully", productRepository.save(newProduct)), HttpStatus.OK)
            : new ResponseEntity<>(new ResponseObject("Failed", "Product Name already Duplicated", newProduct.getProductName()), HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping("/updateProduct/{id}")
    ResponseEntity<ResponseObject> updateProduct(@RequestBody Product newProduct, @PathVariable("id") Long id)
    {
        Product updatedProduct = productRepository.findById(id)
                .map(product -> {
                    product.setProductName(newProduct.getProductName());
                    product.setYear(newProduct.getYear());
                    product.setUrl(newProduct.getUrl());
                    product.setPrice(newProduct.getPrice());
                    return productRepository.save(product);
                }).orElseGet(() ->
                {
                    newProduct.setId(id);
                    return productRepository.save(newProduct);
                });
        return new ResponseEntity<>(new ResponseObject("OK", "Update Product Successfully", updatedProduct), HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable("id") Long id)
    {
        boolean existed = productRepository.existsById(id);
        if(existed)
        {
            productRepository.deleteById(id);
            return new ResponseEntity<>(new ResponseObject("OK", "Delete Product Successfully", id), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseObject("Failed", "Can not find Product Id: " + id, ""), HttpStatus.NOT_FOUND);
    }
}
