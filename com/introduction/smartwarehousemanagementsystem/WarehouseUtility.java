package com.introduction.smartwarehousemanagementsystem;

import java.util.List;

class WarehouseUtility {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getCategory() + ": " + item.getName());
        }
    }
}