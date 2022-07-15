package com.deploytest.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("/2")
    public String hello() {

        return "hello";
    }
}
