package com.sai.springbootdemo.annotationexamples.lazyeager;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public EagerLoader(){
        System.out.println("EagerLoader");
    }
}
