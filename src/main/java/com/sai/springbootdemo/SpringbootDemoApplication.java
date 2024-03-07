package com.sai.springbootdemo;

import com.sai.springbootdemo.annotationexamples.QualifierAnnotation;
import com.sai.springbootdemo.annotationexamples.ValueAnnotationExample;
import com.sai.springbootdemo.annotationexamples.javabasedconfigannotion.SampleJavaBasedConfiguration;
import com.sai.springbootdemo.annotationexamples.javabasedconfigannotion.SampleJavaBasedController;
import com.sai.springbootdemo.annotationexamples.lazyeager.LazyLoader;
import com.sai.springbootdemo.annotationexamples.propertiesannoation.PropertiesAnnotation;
import com.sai.springbootdemo.annotationexamples.scopeannotation.PrototypeBean;
import com.sai.springbootdemo.annotationexamples.scopeannotation.SingletonBean;
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
   /*     SampleJavaBasedController sampleComponent = applicationContext.getBean(SampleJavaBasedController.class);
        LazyLoader lazyLoader = applicationContext.getBean(LazyLoader.class);

        System.out.println(sampleComponent.getCarName());
        System.out.println(lazyLoader.getLazy());*/
 /*       SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
        SingletonBean singletonBean3 = applicationContext.getBean(SingletonBean.class);
        System.out.println(singletonBean1.hashCode());
        System.out.println(singletonBean2.hashCode());
        System.out.println(singletonBean3.hashCode());
        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean3 = applicationContext.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.hashCode());
        System.out.println(prototypeBean2.hashCode());
        System.out.println(prototypeBean3.hashCode());*/
        PropertiesAnnotation valueAnnotationExample =applicationContext.getBean(PropertiesAnnotation.class);
        System.out.println(valueAnnotationExample.name);
        System.out.println(valueAnnotationExample.host);
        System.out.println(valueAnnotationExample.password);


    }

}
