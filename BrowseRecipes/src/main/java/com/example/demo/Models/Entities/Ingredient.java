package com.example.demo.Models.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "deleted=false")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int Id;

    private String ingredient;

    @Column(columnDefinition = "boolean default false")
    private boolean isVeggie;

    @ManyToMany
    @JsonIgnore
    private List<Recipe> recipes;


    @Column(columnDefinition = "boolean default false")
    @JsonIgnore
    private boolean deleted;


    public void init(){
        this.deleted = false;
        this.recipes = new ArrayList<>();
    }


}
