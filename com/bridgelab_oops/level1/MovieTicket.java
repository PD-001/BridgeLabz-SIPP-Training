package com.bridgelab_oops.level1;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket() {
        this.isBooked = false; // initially not booked
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (isBooked) {
            System.out.println("\n--- Ticket Details ---");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}
