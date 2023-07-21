package com.example.springannotations.service.impl;

import com.example.springannotations.service.Pizza;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Non VegPizza";
    }
}
