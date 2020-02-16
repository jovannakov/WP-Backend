package com.example.demo.Web.rest;


import com.example.demo.Models.Entities.Recipe;
import com.example.demo.Services.ServiceInterfaces.RecipeService;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "recipes", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class RecipesController {

    private final RecipeService recipeService;

    public RecipesController(RecipeService recipeService){
        this.recipeService = recipeService;
    }


    @GetMapping
    public List<Recipe> ListAll(){
        return this.recipeService.ListAll();
    }
}
