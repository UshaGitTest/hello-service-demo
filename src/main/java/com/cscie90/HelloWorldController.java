package com.cscie90;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping({"/", "hello"})
    public String helloWorld() {
        return "Hello CSCIE-90 Students test!!!";
    }
}
 