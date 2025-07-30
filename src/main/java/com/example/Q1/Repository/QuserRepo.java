package com.example.Q1.Repository;

import com.example.Q1.Entity.Quser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuserRepo extends JpaRepository<Quser, Long> {

}
