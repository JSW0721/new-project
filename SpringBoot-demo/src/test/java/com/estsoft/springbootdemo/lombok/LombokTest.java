package com.estsoft.springbootdemo.lombok;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LombokTest {
    @Test
    public void test(){
        People people = new People(1L, "name", 20, Arrays.asList("달리기","코딩"));
        people.setHobbies(Arrays.asList("그외 취미", "."));
        System.out.println(people.getHobbies());
    }
}
