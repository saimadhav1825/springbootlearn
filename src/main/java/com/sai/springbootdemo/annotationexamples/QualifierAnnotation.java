package com.sai.springbootdemo.annotationexamples;

import com.sai.springbootdemo.dummyclasses.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QualifierAnnotation {
    private Pizza pizza;

  /*  @Autowired
    @Qualifier("nonVegPizza")
    private Pizza nonVegPizza;
*/


    /*    @Autowired
        public QualifierAnnotation(@Qualifier("vegPizza") Pizza pizza) {
            super();
            this.pizza = pizza;
        }*/
    @Autowired
    public QualifierAnnotation(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }

/*    public String getNonVegPizza() {
        return nonVegPizza.getPizza();
    }*/
}

