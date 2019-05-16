package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComController {

    @RequestMapping("four")
    public String a(){
        return "四个人";
    }

    @RequestMapping("five")
    public String b(){
        return "五个人";
    }

    @RequestMapping("six")
    public String c(){
        return "六个人";
    }

}
