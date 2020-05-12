package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaRepoRole  extends JpaRepository<Role, Integer> {

    @Query("select r from Role r where r.id like :role")
    Role Find(@Param("role") int role);
}
