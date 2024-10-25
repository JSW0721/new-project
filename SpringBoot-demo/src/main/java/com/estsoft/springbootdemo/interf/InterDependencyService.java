package com.estsoft.springbootdemo.interf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InterDependencyService {
    private final Inter inter;

    //interface타입으로 의존성 주입할 때 구현체 지정하는 방법 2가지
    //단, 인터페이스의 구현테가 하나인 경우, 구현테 지정하지 않아도 DI가능.
    //1. @Qualifier("빈이름(구현체) 지정") 이용해서 지정
    //2. @Primary

    public InterDependencyService(@Qualifier("interImplA") Inter inter) {
        this.inter = inter;
    }
    public void printMethod() {
        inter.method();
    }
}
