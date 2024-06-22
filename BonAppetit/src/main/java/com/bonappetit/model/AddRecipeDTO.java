package com.bonappetit.model;

import com.bonappetit.model.entity.CategoryName;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddRecipeDTO {
    @NotNull
    @Size(min = 3, max = 40)
    private String name;

    @NotNull
    @Size(min = 3, max = 150)
    private String ingredients;

    @NotNull
    private CategoryName category;  // Преименувано от categoryName на category

    public AddRecipeDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients() {
        this.ingredients = ingredients;
    }

    public CategoryName getCategory() {
        return category;
    }

    public void setCategory(CategoryName category) {
        this.category = category;
    }
}
