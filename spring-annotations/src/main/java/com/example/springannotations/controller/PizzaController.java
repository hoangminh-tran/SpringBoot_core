package com.example.springannotations.controller;

import com.example.springannotations.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("pizzaController")
public class PizzaController {

    //@Autowired
    private Pizza pizza;

//    @Autowired
    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza()
    {
        return pizza.getPizza();
    }

    public void init()
    {
        System.out.println("Initailization Logic");
    }

    public void destroy()
    {
        System.out.println("Destruction Logic");
    }
}
