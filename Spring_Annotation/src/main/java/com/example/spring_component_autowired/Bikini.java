package com.example.spring_component_autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bikini")
//@Primary

public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("This is Bikini......");
    }
}
