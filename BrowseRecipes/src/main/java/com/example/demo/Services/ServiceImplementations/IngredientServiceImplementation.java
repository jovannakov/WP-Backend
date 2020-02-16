package com.example.demo.Services.ServiceImplementations;

import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Repository.IngredientsRepository;
import com.example.demo.Services.ServiceInterfaces.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImplementation implements IngredientService {

    private final IngredientsRepository ingredientsRepository;


    public IngredientServiceImplementation(IngredientsRepository ingredientsRepository){
        this.ingredientsRepository = ingredientsRepository;
    }

    @Override
    public List<Ingredient> ListAll() {
        return this.ingredientsRepository.ListAll();
    }
}
