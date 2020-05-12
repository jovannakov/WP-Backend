package com.example.demo.Services.ServiceImplementations;


import com.example.demo.Models.DTO.RecipeCreatingModel;
import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Models.Entities.Recipe;
import com.example.demo.Repository.IngredientsRepository;
import com.example.demo.Repository.RecipesRepository;
import com.example.demo.Services.ServiceInterfaces.RecipeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServiceImplementation implements RecipeService {
    private final RecipesRepository recipesRepository;
    private final IngredientsRepository ingredientsRepository;

    public RecipeServiceImplementation(RecipesRepository recipesRepository, IngredientsRepository ingredientsRepository){
        this.recipesRepository = recipesRepository;
        this.ingredientsRepository = ingredientsRepository;
    }

    @Override
    public List<Recipe> ListAll() {
        return this.recipesRepository.ListAll();
    }

    @Override
    public Recipe CreateRecipe(RecipeCreatingModel r) {
        List<Ingredient> ingredients = new ArrayList<>();
        for(String i : r.getIngredients()){
            Ingredient tmp = this.ingredientsRepository.Find(i);
            ingredients.add(tmp);
        }

        Recipe recipe = new Recipe();
        recipe.setName(r.getName());
        recipe.setDescription(r.getDescription());
        recipe.setImgUrl(r.getImgUrl());
        recipe.setVeggie(r.isVeggie());
        recipe.setIngredients(ingredients);

      /*  for(Ingredient i : ingredients){
            List<Recipe> recipes = i.getRecipes();
            recipes.add(recipe);
            i.setRecipes(recipes);
        }
*/

        return this.recipesRepository.CreateRecipe(recipe);
    }

    @Override
    public List<Ingredient> GetIngredients(String name) {
        return this.recipesRepository.GetIngredients(name);
    }

}
