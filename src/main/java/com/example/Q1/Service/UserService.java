package com.example.Q1.Service;

import com.example.Q1.Entity.Quser;
import com.example.Q1.Entity.UserDetailsPrincipal;
import com.example.Q1.Repository.QuserRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private QuserRepo quserRepo;

    public Quser register(@RequestBody Quser quser) {
        return quserRepo.save(quser);
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Quser quser = quserRepo.findByname(name);
        if (quser == null) {
            System.out.println("not found user");
            throw new UsernameNotFoundException("not found");
        }
        return new UserDetailsPrincipal(quser);

    }

}
