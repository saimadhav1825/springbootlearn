package com.sai.springbootdemo.annotationexamples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationExample {
    @Value("${mail.name}")
    public String mail;
    @Value("${mail.host}")
    public String host;
    @Value("${mail.password}")
    public String password;
    @Value("${java.home}")
    public String javaPath;

    public String getMail() {
        return mail;
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }

    public String getJavaPath() {
        return javaPath;
    }
}
