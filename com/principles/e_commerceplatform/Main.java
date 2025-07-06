package com.principles.e_commerceplatform;

public class Main {
	public static void main(String[] args) {
		Product[] products = {
				new Electronics("E101", "Laptop", 50000),
				new Clothing("C202", "T-Shirt", 1200),
				new Groceries("G303", "Rice", 800)
		};

		for (Product product : products) {
			double discount = product.calculateDiscount();
			double tax = 0.0;

			if (product instanceof Taxable) {
				Taxable taxableProduct = (Taxable) product;
				tax = taxableProduct.calculateTax();
				System.out.println(taxableProduct.getTaxDetails());
			}

			double finalPrice = product.getPrice() + tax - discount;

			System.out.println("Product: " + product.getName());
			System.out.println("Price: ₹" + product.getPrice());
			System.out.println("Discount: ₹" + discount);
			System.out.println("Tax: ₹" + tax);
			System.out.println("Final Price: ₹" + finalPrice);
			System.out.println("-------------------------------------");
		}
	}
}
