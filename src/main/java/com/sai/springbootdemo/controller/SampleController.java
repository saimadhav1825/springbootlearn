package com.sai.springbootdemo.controller;

import com.sai.springbootdemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping(path = "/student")
    public Student student() {
        return new Student("student", "100");
    }

    @GetMapping(path = "/students")
    public List<Student> students() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("student", "100"));
        list.add(new Student("student", "100"));
        list.add(new Student("student", "100"));
        list.add(new Student("student", "100"));
        list.add(new Student("student", "100"));
        list.add(new Student("student", "100"));
        list.add(new Student("student", "100"));
        return list;
    }
}
