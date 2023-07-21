package com.example.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanLifeCycleApplication.class, args);

		//Get Bean Girl from the Application Context
		Girl girl = context.getBean(Girl.class);

		System.out.println("This is IOC Container before destroy girl");
		((ConfigurableApplicationContext)context).getBeanFactory().destroyBean(girl);
		System.out.println("This is IOC Container after destroy girl");

	}

}
