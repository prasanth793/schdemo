package com.example.schdemo.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @Value("${spring.custom.val}")
    private String propVal;

    @GetMapping("/")
    String getVal(){
        return propVal;
    }

}
