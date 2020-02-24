package com.example.demo.Models.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Where(clause = "deleted=false")
public class Recipe {

    @Id
    private String name;

    private String description;


    @JsonIgnore
    @ManyToMany(mappedBy = "recipes")
    private List<Ingredient> ingredients;

    private String imgUrl;


    @JsonIgnore
    private boolean deleted;


    public void init(){
        this.deleted = false;
    }

}
