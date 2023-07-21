package com.example.spring_component_autowired;

import org.springframework.stereotype.Component;

//This is a bean which is controled by spring IOC container
@Component("naked")
public class Naked implements Outfit{
    @Override
    public void wear() {
        System.out.println("This is naked..");
    }
}
