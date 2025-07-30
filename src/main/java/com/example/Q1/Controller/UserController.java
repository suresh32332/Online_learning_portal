package com.example.Q1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.Q1.Entity.Quser;
import com.example.Q1.Repository.QuserRepo;
import com.example.Q1.Service.UserService;

@RestController
//@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private QuserRepo quserRepo;

    
    @PostMapping("/register")
    public ResponseEntity<Quser> registerUser(@RequestBody Quser user) {
        Quser savedUser = userService.register(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // @PostMapping("/register")
    // public Quser register(@RequestBody Quser user) {
    //     return userService.register(user);
    // }

    @GetMapping("user")
    public List<Quser> getAllUser() {
        return quserRepo.findAll();
    }

}
