package spring_boot_helloworld.qaq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_test {
    @RequestMapping("/hello")
    public String hello(String name) {
        name="spring boot";
        return "hello world!, " +name;
    }
}