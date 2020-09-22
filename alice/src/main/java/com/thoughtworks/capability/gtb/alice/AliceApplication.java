package com.thoughtworks.capability.gtb.alice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class AliceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AliceApplication.class, args);
  }

  @GetMapping("/hello")
  public String helloFromBob(){
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject("http://bob:8081/hello", String.class);
  }
}
