package com.spring.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/jenkins-greeting")
    public String sayHello() {

        return "Hello with jenkins";

    }
}
