package com.example.demo.Web.rest;


import com.example.demo.Models.DTO.RecipeCreatingModel;
import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Models.Entities.Recipe;
import com.example.demo.Services.ServiceInterfaces.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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


    // TREBA DA SE SMENAT SERVISITE I DA SE IMPLEMENTIRA
    // FILTRIRANJE NA SOSTOJKITE


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe CreateRecipe(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "img") String img,
            @RequestParam(value = "veggie") boolean veggie,
            @RequestParam(value = "ingredients") List<String> ingredients
    ){
        RecipeCreatingModel r = new RecipeCreatingModel();
        r.setName(name);
        r.setDescription(description);
        r.setImgUrl(img);
        r.setVeggie(veggie);
        r.setIngredients(ingredients);
        return recipeService.CreateRecipe(r);
    }


    // ne funkcionira ovoa
    @GetMapping(params = "name")
    public List<Ingredient> GetIngredients(@RequestParam String name){
         return this.recipeService.GetIngredients(name);
    }

}
