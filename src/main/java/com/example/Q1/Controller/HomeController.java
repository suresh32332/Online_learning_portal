package com.example.Q1.Controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getMethodName(HttpServletRequest request) {
        return "Home Controller page " + request.getSession().getId();
    }

}
