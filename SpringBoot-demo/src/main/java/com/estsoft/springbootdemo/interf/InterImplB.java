package com.estsoft.springbootdemo.interf;

import org.springframework.context.annotation.Primary;

public class InterImplB implements Inter {
    @Override
    public void method() {
        System.out.println("InterImplB method");
    }
}
