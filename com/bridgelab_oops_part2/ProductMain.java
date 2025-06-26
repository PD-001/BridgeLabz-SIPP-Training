package com.bridgelab_oops_part2;

public class ProductMain {
	public static void main(String[] args) {
		// Create instances of Product
		// Each instance will automatically increment the totalProducts count
		Product p1 = new Product("Laptop", 999.99);
		Product p2 = new Product("Smartphone", 499.49);
		Product p3 = new Product("Headphones", 89.99);

		// Display product details and total products created
		System.out.println("Product Details:\n");
		p1.displayProductDetails();
		System.out.println();
		p2.displayProductDetails();
		System.out.println();
		p3.displayProductDetails();

		// Display total number of products created
		System.out.println();
		Product.displayTotalProducts();
	}
}
