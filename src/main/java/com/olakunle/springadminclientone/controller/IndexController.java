package com.olakunle.springadminclientone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IndexController {

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Hello welcome to Spring Admin Client Project One";
    }

}
