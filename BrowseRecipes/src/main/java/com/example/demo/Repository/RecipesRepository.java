package com.example.demo.Repository;

import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Models.Entities.Recipe;

import java.util.List;

public interface RecipesRepository {

    public List<Recipe> ListAll();

    Recipe CreateRecipe(Recipe r);

    List<Ingredient> GetIngredients(String name);
}
