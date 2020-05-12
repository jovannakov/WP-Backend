package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Ingredient;
import com.example.demo.Repository.IngredientsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaIngredient implements IngredientsRepository {

    private final JpaRepositoryIngredient jpaRepositoryIngredient;

    public JpaIngredient(JpaRepositoryIngredient jpaRepositoryIngredient){
        this.jpaRepositoryIngredient = jpaRepositoryIngredient;
    }

    @Override
    public List<Ingredient> ListAll() {
        return jpaRepositoryIngredient.getall();
    }

    @Override
    public Ingredient CreateIngredient(Ingredient ingredient) {
        return jpaRepositoryIngredient.save(ingredient);
    }

    @Override
    public Ingredient Delete(String name) {
        Ingredient delete = jpaRepositoryIngredient.Find(name);
        delete.setDeleted(true);
        jpaRepositoryIngredient.save(delete);
        return delete;
    }

    @Override
    public Ingredient Find(String name) {
        Ingredient i = this.jpaRepositoryIngredient.Find(name);
        return i;
    }


}
