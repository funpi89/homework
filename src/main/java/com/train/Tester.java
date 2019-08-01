package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int tickets;
        int roundTripTickets;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        roundTripTickets = scanner.nextInt();
        Ticket tk = new Ticket(tickets,roundTripTickets);
        System.out.println("Total tickets: "+tickets);
        System.out.println("Round-trip: "+roundTripTickets);
        System.out.println("Total: "+tk.total());
    }
}
