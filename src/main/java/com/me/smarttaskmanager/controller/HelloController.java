package com.me.smarttaskmanager.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/")
public class HelloController {

    @GetMapping("/home")
    public String greet() {
        return "Hello World";
    }

}
