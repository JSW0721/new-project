package com.estsoft.springbootdemo.config;
//컴포넌트 스캔 수동 추가

import banking.DTO.TestDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.estsoft.Ex")
public class MyConfiguration {
    @PersistenceContext
    private EntityManager em;

    @Bean
    public List<TestDTO> selectPostWithCount(){
        return List.of();
    }
}
