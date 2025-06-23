package com.bridgelab_oops.level1;

import java.util.Scanner;

public class ItemMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Item code:");
		int itemCode=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Item name:");
		String itemName=sc.nextLine();
		
		System.out.println("Enter Item price:");
		double price=sc.nextDouble();
		
		Item item=new Item(itemCode, itemName, price);
		
		item.itemDetails();
		
		System.out.println("Enter Item quantity:");
		int quantity=sc.nextInt();
		
		item.totalCost(quantity);
		
		sc.close();
		
	}

}
