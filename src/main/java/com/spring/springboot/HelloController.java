package com.spring.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//  @RequestMapping(method= RequestMethod.GET, path="/hello/{name}")
  @GetMapping(path="/hello/{name}") // endpoint
  public String hello(@PathVariable String name) {
    return String.format("Hello, %s", name);
  }

}