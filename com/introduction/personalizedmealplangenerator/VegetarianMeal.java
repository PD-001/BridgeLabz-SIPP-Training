package com.introduction.personalizedmealplangenerator;

import java.util.Arrays;
import java.util.List;

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public List<String> getMeals() {
        return Arrays.asList("Paneer Tikka", "Dal Rice", "Veg Salad");
    }
}