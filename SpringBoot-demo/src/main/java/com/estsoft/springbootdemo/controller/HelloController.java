package com.estsoft.springbootdemo.controller;

import com.estsoft.springbootdemo.interf.InterDependencyService;
import com.estsoft.springbootdemo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService service; //Dependency Injection
    private final InterDependencyService dps;

/*    public HelloController(HelloService service)
    {//요새는 @autowired안쓰고 생성자 이용함
        this.service = service;
    }*/

    public HelloController(HelloService service, InterDependencyService dps) {
        this.service = service;
        this.dps = dps;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "param", defaultValue = "Spring") String param){
        //spring에게 제어권 맡기기
        //return service.printHello(param);
        dps.printMethod();

        return service.printHello(param);
    }
}
