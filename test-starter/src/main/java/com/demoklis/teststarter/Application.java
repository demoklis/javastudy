package com.demoklis.teststarter;

import com.demoklis.starter.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
      SpringApplication.run(Application.class);
  }
  @Autowired
  private Service service;

    @GetMapping(value = "/{abc}")
    public String getService(@PathVariable("abc") String abc){
        return service.wrap(abc);
    }

    @Bean
    public Service getBean(){
        return new Service("11","22");
    }
}
