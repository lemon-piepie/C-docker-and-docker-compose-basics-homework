package com.thoughtworks.capability.gtb.alice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
