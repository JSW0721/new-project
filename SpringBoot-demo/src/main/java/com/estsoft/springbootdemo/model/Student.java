package com.estsoft.springbootdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.sql.Date;

@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private int age;
    private String desc;
    private LocalDate createdAt;

    public Student() {}
    public Student(Long id, String name, int age, String desc, Date createdAt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.desc = desc;
        this.createdAt = createdAt.toLocalDate();
    }
}
