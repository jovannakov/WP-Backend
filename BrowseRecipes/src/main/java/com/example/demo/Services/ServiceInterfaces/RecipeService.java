package com.example.demo.Services.ServiceInterfaces;

import com.example.demo.Models.DTO.RecipeCreatingModel;
import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Models.Entities.Recipe;

import java.util.List;

public interface RecipeService {

    public List<Recipe> ListAll();

    Recipe CreateRecipe(RecipeCreatingModel r);

    List<Ingredient> GetIngredients(String name);
}
