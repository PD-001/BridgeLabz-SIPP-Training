package com.introduction.personalizedmealplangenerator;

import java.util.Arrays;
import java.util.List;

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }

    public List<String> getMeals() {
        return Arrays.asList("Protein Shake", "Egg White Omelette", "Lentil Soup");
    }
}