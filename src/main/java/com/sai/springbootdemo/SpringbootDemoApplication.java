package com.sai.springbootdemo;

import com.sai.springbootdemo.subone.SampleComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {
	//This Class will entry point class or application

    public static void main(String[] args) {
        //ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringbootDemoApplication.class, args);
       /* SampleComponent sampleComponent = applicationContext.getBean(SampleComponent.class);

        System.out.println(sampleComponent.getMessage());*/
    }

}
