package com.example.demo.Models.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
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
    private List<Recipe> recipes;


    private boolean deleted;


    public void init(){
        this.deleted = false;
    }


}
