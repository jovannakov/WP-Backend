package com.example.demo.Models.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCreatingModel {

    private String name;

    private String description;

    private List<String> ingredients;

    private String imgUrl;

    private boolean veggie;
}
