package com.estsoft.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//등록된 빈 목록 확인
public class ComponentScanTest {
    //test code
    @Test
    public void test(){
        //스프링컨테이너에 등록된 빈의 확인을 위한 ApplicationContext 객체 생성.
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootDemoApplication.class);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println("#bean Name : " + bean);
        }
    }
}
