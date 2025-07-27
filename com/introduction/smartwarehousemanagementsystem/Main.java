package com.introduction.smartwarehousemanagementsystem;

public class Main {
	public static void main(String[] args) {
        // Storage for Electronics
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Smartphone"));

        // Storage for Groceries
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Apples"));

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items using wildcard method
        System.out.println("Electronics Items:");
        WarehouseUtility.displayItems(electronicStorage.getItems());

        System.out.println("\nGrocery Items:");
        WarehouseUtility.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}