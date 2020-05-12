package com.example.demo.Repository;

import com.example.demo.Models.Entities.Ingredient;

import java.util.List;

public interface IngredientsRepository {

    public List<Ingredient> ListAll();

    public Ingredient CreateIngredient(Ingredient ingredient);

    public Ingredient Delete(String name);

    public Ingredient Find(String name);
}
