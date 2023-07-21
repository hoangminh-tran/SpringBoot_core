package com.example.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @PostConstruct
    public void postConstructor()
    {
        System.out.println("This method will call after the Bean Girl is created");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("This method will call before the Bean Girl is destroy");
    }
}
