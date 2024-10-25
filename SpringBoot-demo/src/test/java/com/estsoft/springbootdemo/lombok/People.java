package com.estsoft.springbootdemo.lombok;

import lombok.*;

import java.util.List;

//POJO
@AllArgsConstructor
@RequiredArgsConstructor
@Getter //아래 항목들의 getter를 자동 생성
@Setter //아래 항목들의 setter를 자동 생성
public class People {
    private final Long id;
    private final String name;
    private int age;
    private List<String> hobbies;

    /*@allArgsConstructor로 대체됨
    public People(Long id, String name, int age, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }*/
}
