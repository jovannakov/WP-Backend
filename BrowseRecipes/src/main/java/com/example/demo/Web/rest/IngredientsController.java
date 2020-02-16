package com.example.demo.Web.rest;


import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Services.ServiceInterfaces.IngredientService;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
