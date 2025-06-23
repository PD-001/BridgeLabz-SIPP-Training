package com.bridgelab_oops.level2;

import java.util.Scanner;

public class MovieTicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        // Booking input
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        // Book and display ticket
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();

        sc.close();
    }
}
