package com.example.configuration_bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigurationBeanApplication.class, args);
		System.out.println(context.getBean(Girl.class));
	}

}
