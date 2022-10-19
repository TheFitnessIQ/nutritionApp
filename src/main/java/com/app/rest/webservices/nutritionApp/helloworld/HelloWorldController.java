package com.app.rest.webservices.nutritionApp.helloworld;


//REST API

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // /hello-world
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello Get World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
       return new HelloWorldBean("Hello Bean World");
    }

    //path parameters
    //hello-world/path-variable/{name}
    @GetMapping(path = "hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean("Hello "+name);
    }
}
