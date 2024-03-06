package com.sai.springbootdemo.dummyclasses;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "NonVegPizza";
    }
}
