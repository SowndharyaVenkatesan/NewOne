package com.test.divya.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/tests")
    public void test() {
        String s = check();
        System.out.println("hello world123");
    }

    public String check() {
        System.out.println("check123fghh_Latest");
        return "success";
    }

}
