package com.sai.springbootdemo.annotationexamples.propertiesannoation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
public class PropertiesConfig {
}
