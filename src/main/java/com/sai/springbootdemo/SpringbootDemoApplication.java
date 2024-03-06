package com.sai.springbootdemo;

import com.sai.springbootdemo.annotationexamples.QualifierAnnotation;
import com.sai.springbootdemo.annotationexamples.javabasedconfigannotion.SampleJavaBasedConfiguration;
import com.sai.springbootdemo.annotationexamples.javabasedconfigannotion.SampleJavaBasedController;
import com.sai.springbootdemo.annotationexamples.lazyeager.LazyLoader;
import com.sai.springbootdemo.subone.SampleComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class SpringbootDemoApplication {
    //This Class will entry point class or application

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringbootDemoApplication.class, args);
        SampleJavaBasedController sampleComponent = applicationContext.getBean(SampleJavaBasedController.class);
        LazyLoader lazyLoader = applicationContext.getBean(LazyLoader.class);

        System.out.println(sampleComponent.getCarName());
        System.out.println(lazyLoader.getLazy());
    }

}
