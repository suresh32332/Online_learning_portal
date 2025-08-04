package com.example.Q1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.Q1.Entity.Quser;
import com.example.Q1.Repository.QuserRepo;
import com.example.Q1.Service.UserService;

@RestController
// @RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private QuserRepo quserRepo;

    @PostMapping("/register")
    public Quser register(@RequestBody Quser quser) {
        return service.register(quser);
    }

    @GetMapping("user")
    public List<Quser> getAllUser() {
        return quserRepo.findAll();
    }

}
