package com.estsoft.springproject.blog.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Slf4j
@RestController
public class ExternalApiController {
    @GetMapping("/api/external")
    public String callApi(){
        RestTemplate restTemplate = new RestTemplate();
        //역직렬화
        String url = "https://jsonplaceholder.typicode.com/post";
        ResponseEntity responseEntity = restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<Content>>);
        //ResponseEntity<String>json = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
        //restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", ResponseEntity.class);

        log.info("code : {}", resultList.getStatusCode());
        log.info("{}", resultList.getBody());
;        //log.info("StatusCode : {}", json.getStatusCode());
        //log.info(json.getBody());

        //역직렬화(json->object)

        return "OK";
    }
}
