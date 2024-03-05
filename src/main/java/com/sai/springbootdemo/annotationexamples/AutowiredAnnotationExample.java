package com.sai.springbootdemo.annotationexamples;

import com.sai.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredAnnotationExample {

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    //setter injection
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    private EmployeeService employeeService;
    //@Autowired   filed injection
    //    private EmployeeService employeeService;

    //Constructor Injection
   /* @Autowired
    public AutowiredAnnotationExample(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }*/

}
