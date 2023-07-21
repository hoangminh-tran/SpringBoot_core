package com.example.springannotations;

import com.example.springannotations.controller.MyController;
import com.example.springannotations.controller.PizzaController;
import com.example.springannotations.lazy.LazyLoader;
import com.example.springannotations.propertysource.PropertySourceDemo;
import com.example.springannotations.repository.MyRepository;
import com.example.springannotations.scope.PrototypeBean;
import com.example.springannotations.scope.SingletonBean;
import com.example.springannotations.service.impl.MyService;
import com.example.springannotations.service.impl.VegPizza;
import com.example.springannotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		// ApplicationContext is the same as the IOC container contain bean
		ApplicationContext context = SpringApplication.run(SpringAnnotationsApplication.class, args);

//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getPizza());

//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());

//		MyController myController = context.getBean(MyController.class);
//		System.out.println(myController.hello());
//
//		MyService myService = context.getBean(MyService.class);
//		System.out.println(myService.hello());
//
//		MyRepository myRepository = context.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//
//		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());
//
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean3.hashCode());
//
//		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//		System.out.println(valueAnnotationDemo.getDefaultName());
//		System.out.println(valueAnnotationDemo.getHost());
//		System.out.println(valueAnnotationDemo.getEmail());
//		System.out.println(valueAnnotationDemo.getPassword());

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDescription());
	}
}
