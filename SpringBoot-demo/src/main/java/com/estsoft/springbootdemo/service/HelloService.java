package com.estsoft.springbootdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service //스프링에게 제어권 맡기기
public class HelloService {

    public String printHello(String param) {
        //스프링에게 제어권 맡기기
        return "Hello " + param;
    }
}
