package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaRepositoryUser extends JpaRepository<User, Integer> {

    @Query("select u from User u")
    List<User> getall();
}
