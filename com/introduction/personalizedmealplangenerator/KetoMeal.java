package com.introduction.personalizedmealplangenerator;

import java.util.Arrays;
import java.util.List;

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public List<String> getMeals() {
        return Arrays.asList("Grilled Chicken", "Avocado Salad", "Boiled Eggs");
    }
}