package com.sukhjit.onlineshopping.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/Hello")
    public String sayHi(){
        return "Hello, Welcome to our online store";
    }

}
