package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Models.Entities.Recipe;
import com.example.demo.Repository.RecipesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaRecipes implements RecipesRepository {

    private final JpaRepositoryRecipe jpaRepositoryRecipe;

    public JpaRecipes(JpaRepositoryRecipe jpaRepositoryRecipe){
        this.jpaRepositoryRecipe = jpaRepositoryRecipe;
    }


    @Override
    public List<Recipe> ListAll() {
        return jpaRepositoryRecipe.getall();
    }

    @Override
    public Recipe CreateRecipe(Recipe r) {
        return this.jpaRepositoryRecipe.save(r);
    }

    @Override
    public List<Ingredient> GetIngredients(String name) {
        return this.jpaRepositoryRecipe.Find(name).getIngredients();
    }
}
