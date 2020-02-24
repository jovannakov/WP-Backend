package com.example.demo.Web.rest;


import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Services.ServiceInterfaces.IngredientService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "ingredients", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class IngredientsController {


    private final IngredientService ingredientService;


    public IngredientsController(IngredientService ingredientService){
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public List<Ingredient> ListAll(){
        return ingredientService.ListAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient CreateIngredient(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "veggie") boolean veggie
    ){
        Ingredient tmp = new Ingredient();
        tmp.setIngredient(name);
        tmp.setVeggie(veggie);
        tmp.setRecipes(new ArrayList<>());
        return ingredientService.CreateIngredient(tmp);
    }


    @DeleteMapping("/{name}")
    public Ingredient DeleteIngredient(@PathVariable String name){
        return this.ingredientService.Delete(name);
    }

}
