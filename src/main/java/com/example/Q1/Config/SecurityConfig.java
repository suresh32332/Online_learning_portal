package com.example.Q1.Config;


import org.springframework.security.config.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public DefaultSecurityFilterChain securityWebFilterChain (HttpSecurity  http) throws Exception{

        http 
        .csrf(customizer -> customizer.disable())
        .authorizeHttpRequests(request -> request.anyRequest().authenticated())
        // work from browser 
        .formLogin(Customizer.withDefaults())
        // postman 
        .httpBasic(Customizer.withDefaults());
        
        
        return http.build();
    }
    
}
