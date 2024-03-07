package com.sai.springbootdemo.controller;

import com.sai.springbootdemo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    @RequestMapping(value = {"/name", "/names"}, method = RequestMethod.GET)
    public List<Integer> getNames() {
        return IntStream.rangeClosed(1, 10)
                .boxed().toList();
    }

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestParam("id") long id,
                                               @RequestParam("name") String name,
                                               @RequestParam("marks") int marks) {
        return new ResponseEntity<>(new Student(name, String.valueOf(marks)), HttpStatus.CREATED);
    }
}
