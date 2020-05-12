package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaRepositoryRecipe extends JpaRepository<Recipe, Integer> {

    @Query("select r from Recipe r")
    List<Recipe> getall();

    @Query("select r.name from Recipe r where r.name like :name")
    Recipe Find(String name);
}
