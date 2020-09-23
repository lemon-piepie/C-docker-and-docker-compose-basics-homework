package com.thoughtworks.capability.gtb.alice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceApi {
    @GetMapping("/hello")
    public String helloFromBob(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://bob:8081/hello", String.class);
    }
}
