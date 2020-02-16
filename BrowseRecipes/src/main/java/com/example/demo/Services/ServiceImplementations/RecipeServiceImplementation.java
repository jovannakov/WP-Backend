package com.example.demo.Services.ServiceImplementations;


import com.example.demo.Models.Entities.Recipe;
import com.example.demo.Repository.RecipesRepository;
import com.example.demo.Services.ServiceInterfaces.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImplementation implements RecipeService {
    private final RecipesRepository recipesRepository;


    public RecipeServiceImplementation(RecipesRepository recipesRepository){
        this.recipesRepository = recipesRepository;
    }

    @Override
    public List<Recipe> ListAll() {
        return this.recipesRepository.ListAll();
    }
}
