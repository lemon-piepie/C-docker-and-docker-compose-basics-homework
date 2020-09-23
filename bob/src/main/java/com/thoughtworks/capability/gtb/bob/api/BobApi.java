package com.thoughtworks.capability.gtb.bob.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobApi {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bob!";
    }
}