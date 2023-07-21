package com.example.componentscan.core;

import com.example.componentscan.core.model.Boy;
import com.example.componentscan.core.others.AnotherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.*")
//@ComponentScan("com.example.*")
public class ComponentScanApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ComponentScanApplication.class, args);
        System.out.println(context.getBean(Boy.class));
    }

}
