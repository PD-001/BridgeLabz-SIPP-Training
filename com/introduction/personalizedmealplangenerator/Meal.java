package com.introduction.personalizedmealplangenerator;

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayPlan() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Meals: " + String.join(", ", mealPlan.getMeals()));
    }
}