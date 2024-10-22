package com.github.vetordev.jspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping()
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping()
    public String helloWorld2() {
        return "Hello Worldz!";
    }
}
