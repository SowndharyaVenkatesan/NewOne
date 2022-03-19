package com.test.divya.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/tests")
    public void test() {
        System.out.println("hello world123");
    }


}
