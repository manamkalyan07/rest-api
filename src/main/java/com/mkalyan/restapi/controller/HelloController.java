package com.mkalyan.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/rest-api/hello")
    public String sayHello(){
        return "Say Hello.... Spring Boot ....";
    }
}
