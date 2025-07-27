package com.introduction.personalizedmealplangenerator;

public class Main {
    public static void main(String[] args) {
        // Create instances of each meal type
        // and generate meal plans for each type
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal highProtein = new HighProteinMeal();

        Meal<VegetarianMeal> vegPlan = MealPlanner.generateMealPlan(veg);
        Meal<VeganMeal> veganPlan = MealPlanner.generateMealPlan(vegan);
        Meal<KetoMeal> ketoPlan = MealPlanner.generateMealPlan(keto);
        Meal<HighProteinMeal> proteinPlan = MealPlanner.generateMealPlan(highProtein);

        // Display the generated meal plans
        System.out.println();
        vegPlan.displayPlan();
        System.out.println();
        veganPlan.displayPlan();
        System.out.println();
        ketoPlan.displayPlan();
        System.out.println();
        proteinPlan.displayPlan();
    }
}
