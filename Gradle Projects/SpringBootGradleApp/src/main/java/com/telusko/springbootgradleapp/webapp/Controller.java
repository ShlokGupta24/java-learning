package com.telusko.springbootgradleapp.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping("/")
    public String getInfo(){
        return "Gradle Application";
    }
}