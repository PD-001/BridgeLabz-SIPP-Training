package com.introduction.personalizedmealplangenerator;

import java.util.Arrays;
import java.util.List;

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public List<String> getMeals() {
        return Arrays.asList("Tofu Stir Fry", "Quinoa Bowl", "Fruit Smoothie");
    }
}