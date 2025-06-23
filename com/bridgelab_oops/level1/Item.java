package com.bridgelab_oops.level1;

public class Item {

	private int itemCode;
	private String itemName;
	private double price;
	
	public Item(int itemCode, String itemName, double price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	
	public void itemDetails() {
		System.out.println("Item Details: ");
		System.out.println("Item Code: " + itemCode);
		System.out.println("Item Name: " + itemName);
		System.out.println("Item Price: " + price);
	}
	
	public void totalCost(int quantity) {
		System.out.println("The total cost is: " + price * quantity);
	}
}
