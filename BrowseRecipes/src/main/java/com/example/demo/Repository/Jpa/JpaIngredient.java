package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Repository.IngredientsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaIngredient implements IngredientsRepository {

    private final JpaRepositoryIngredient jpaRepositoryIngredient;

    public JpaIngredient(JpaRepositoryIngredient jpaRepositoryIngredient){
        this.jpaRepositoryIngredient = jpaRepositoryIngredient;
    }

    @Override
    public List<Ingredient> ListAll() {
        return jpaRepositoryIngredient.getall();
    }
}
