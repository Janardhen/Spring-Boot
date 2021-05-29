package com.janardhen.test1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String getHelloWorld(){
        return "Hello World";
    }
}
