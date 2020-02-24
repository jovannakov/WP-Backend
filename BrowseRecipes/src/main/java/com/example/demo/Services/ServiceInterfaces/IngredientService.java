package com.example.demo.Services.ServiceInterfaces;

import com.example.demo.Models.Entities.Ingredient;

import java.util.List;

public interface IngredientService {

    public List<Ingredient> ListAll();

    public Ingredient CreateIngredient(Ingredient ingredient);

    Ingredient Delete(String name);
}
