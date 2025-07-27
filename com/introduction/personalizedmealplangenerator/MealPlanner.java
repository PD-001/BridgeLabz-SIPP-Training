package com.introduction.personalizedmealplangenerator;

class MealPlanner {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        // Add additional validations here if needed
        System.out.println("Generating personalized plan for: " + mealPlan.getMealType());
        return new Meal<>(mealPlan);
    }
}