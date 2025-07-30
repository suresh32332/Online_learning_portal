package com.example.Q1.Service;


import com.example.Q1.Entity.Quser;
import com.example.Q1.Repository.QuserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private QuserRepo quserRepo;

    public Quser register(@RequestBody Quser quser){
        return quserRepo.save(quser);
    }


}
