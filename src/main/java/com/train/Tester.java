package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int tickets;
        int round_trip_tickets;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        round_trip_tickets = scanner.nextInt();
        Ticket tk = new Ticket(tickets,round_trip_tickets);
        System.out.println("Total tickets: "+tickets);
        System.out.println("Round-trip: "+round_trip_tickets);
        System.out.println("Total: "+tk.total());
    }
}
