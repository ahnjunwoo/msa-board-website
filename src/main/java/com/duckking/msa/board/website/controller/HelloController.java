package com.duckking.msa.board.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
