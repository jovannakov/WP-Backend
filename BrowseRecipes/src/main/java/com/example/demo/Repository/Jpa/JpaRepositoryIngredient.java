package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaRepositoryIngredient extends JpaRepository<Ingredient, Integer> {

    @Query("select i from Ingredient i")
    List<Ingredient> getall();

}
