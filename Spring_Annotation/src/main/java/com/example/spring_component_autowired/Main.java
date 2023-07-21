package com.example.spring_component_autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		Outfit outfit = (Outfit) context.getBean("naked");
		System.out.println(outfit);
		outfit.wear();

		Girl girl = context.getBean(Girl.class);
		System.out.println(girl);
		System.out.println("Outfit of the girl: " + girl.outfit);
		girl.outfit.wear();
	}

}
