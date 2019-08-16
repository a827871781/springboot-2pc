package com.example.springboot2pc.controller;


import com.example.springboot2pc.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private Test1Service test1Service;

    @RequestMapping("test")
    public String  test() {
        test1Service.insert();
        return "ok";
    }

}
