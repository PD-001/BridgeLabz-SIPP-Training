package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Main {
	// Driver class for Restaurant System
	public static void main(String[] args) {
		// Creating instances of Chef and Waiter classes
		Chef chef = new Chef("Ravi", 101);
		Waiter waiter = new Waiter("Aman", 102);

		// Displaying information and performing duties
		chef.displayInfo();
		chef.performDuties();

		waiter.displayInfo();
		waiter.performDuties();
	}
}
