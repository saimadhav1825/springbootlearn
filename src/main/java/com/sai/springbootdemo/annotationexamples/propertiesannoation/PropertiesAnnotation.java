package com.sai.springbootdemo.annotationexamples.propertiesannoation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesAnnotation {
    @Value("${mail.name}")
    public String name;
    @Value("${mail.host}")
    public String host;
    @Value("${mail.password}")
    public String password;

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }
}
