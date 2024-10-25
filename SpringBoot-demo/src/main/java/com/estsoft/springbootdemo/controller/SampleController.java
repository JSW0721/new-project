package com.estsoft.springbootdemo.controller;

import com.estsoft.Ex.HiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
/*    private HiService hiService;

    public SampleController(HiService hiService) {
        this.hiService = hiService;
    }*/
    @GetMapping("/hello2")
    public String hello2(){
        //비지니스 로직(MODEL)
        return "hi";//"hi.html"의 view 형태를 리턴 및 찾아주는게 DispatcherServelet이 하는 일.
    }
}
