package com.microservicedevops.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/microservicedevops/api/v1")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello ()
    {
        return "Welcome to Micro Service Devops integration";
    };

    @GetMapping("/hello/{id}")
    public String hello (@PathVariable ("name") String name)

    {
        return "Welcome to Micro Service Devops integration" + name;
    };

}
