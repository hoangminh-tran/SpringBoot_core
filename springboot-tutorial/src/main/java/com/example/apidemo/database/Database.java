package com.example.apidemo.database;

import com.example.apidemo.models.Product;
import com.example.apidemo.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository)
//    Command-line runners are a useful functionality to execute the various types of code that only have to be run once, right after application startup.
//    Sometimes we need to insert records into a database while application startup, for example:
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product(1L, "Macbook Pro 16", 2020, 1999.0, "");
                Product productB = new Product(2L, "Iphone 14 Pro ", 2022, 199.0, "");
                logger.info("Insert data" + productRepository.save(productA));
                logger.info("Insert data" + productRepository.save(productB));
            }
        };
    }
}
