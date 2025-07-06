package com.principles.e_commerceplatform;

class Clothing extends Product implements Taxable {
	public Clothing(String productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	public double calculateDiscount() {
		return getPrice() * 0.15; // 15% discount
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.05; // 5% tax
	}

	@Override
	public String getTaxDetails() {
		return "Clothing Tax: 5%";
	}
}