package com.example.Q1.Repository;

import com.example.Q1.Entity.Quser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories

public interface QuserRepo extends JpaRepository<Quser, Long> {

     Quser findByname(String name);
}
