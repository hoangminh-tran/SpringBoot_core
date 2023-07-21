package com.example.configuration_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Girl createGirl()
    {
        Girl girl = new Girl();
        girl.setName("Lisa");
        girl.setAge(30);
        return girl;
    }
}
