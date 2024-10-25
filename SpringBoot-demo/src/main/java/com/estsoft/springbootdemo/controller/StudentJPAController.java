package com.estsoft.springbootdemo.controller;

import com.estsoft.springbootdemo.entity.Student;

import com.estsoft.springbootdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


public class StudentJPAController {
    @Autowired
    private StudentRepository sturep;

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable Long id){
        return sturep.findById(id).get().getName();
    }

    @GetMapping("/student")
    public Long saveStudent(
            @RequestParam String name,
            @RequestParam Integer age,
            @RequestParam(required = false)String desc){
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        stu.setDesc(desc);
        sturep.save(stu);

        return stu.getId();
    }
}
