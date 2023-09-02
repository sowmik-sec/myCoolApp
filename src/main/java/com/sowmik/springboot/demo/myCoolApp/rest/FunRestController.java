package com.sowmik.springboot.demo.myCoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping("/workout")
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is a sunny day";
    }
}
