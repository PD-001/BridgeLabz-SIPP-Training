package com.bridgelab_oops_part2;

public class HotelBookingMain {
	public static void main(String[] args) {
		// Using default constructor
		HotelBooking defaultBooking = new HotelBooking();
		System.out.println("Default Booking:");
		defaultBooking.displayBooking();

		System.out.println();

		// Using parameterized constructor
		HotelBooking customBooking = new HotelBooking("Ayush", "Deluxe", 2);
		System.out.println("Custom Booking:");
		customBooking.displayBooking();

		System.out.println();

		// Using copy constructor
		HotelBooking copiedBooking = new HotelBooking(customBooking);
		System.out.println("Copied Booking:");
		copiedBooking.displayBooking();
	}

}
