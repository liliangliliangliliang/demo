package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("one")
    public String a(){
        return "一个人";
    }

    @RequestMapping("two")
    public String b(){
        return "二个人";
    }

    @RequestMapping("three")
    public String c(){
        return "三个人";
    }


}
