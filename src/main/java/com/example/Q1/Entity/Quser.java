package com.example.Q1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Quser")
public class Quser {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String Email;
    private String Password;
    private String Role;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "Quser{" +
                "Id=" + Id +
                ", Name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }
}

