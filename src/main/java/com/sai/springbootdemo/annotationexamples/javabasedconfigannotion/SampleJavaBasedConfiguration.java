package com.sai.springbootdemo.annotationexamples.javabasedconfigannotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleJavaBasedConfiguration {

    @Bean
    public Car audiCar() {
        return new AudiCar();
    }

    @Bean
    public Car benzCar() {
        return new BenzCar();
    }

    @Bean
    public SampleJavaBasedController sampleJavaBasedController() {
        return new SampleJavaBasedController(audiCar());
    }
}
