package com.example.demo.repository;


import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    boolean   existsByUsername(String username);


    UserEntity findByUsername(String username);

}
