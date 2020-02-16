package com.example.demo.Services.ServiceImplementations;


import com.example.demo.Models.Entities.Recipe;
import com.example.demo.Repository.RecipesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImplementation {
    private final RecipesRepository recipesRepository;


    public RecipeServiceImplementation(RecipesRepository recipesRepository){
        this.recipesRepository = recipesRepository;
    }

    public List<Recipe> listAll(){
        return this.recipesRepository.ListAll();
    }

}
