package com.sai.springbootdemo.annotationexamples.javabasedconfigannotion;


public class SampleJavaBasedController {
    public SampleJavaBasedController(Car car) {
        super();
        this.car = car;
    }

    public Car car;

    public String getCarName() {
        return car.getName();
    }


}
