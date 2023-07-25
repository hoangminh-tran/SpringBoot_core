package com.example.apidemo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private int year;
    private Double price;
    private String url;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseObject {
        private String status;
        private String message;
        private Object data;
    }
}
