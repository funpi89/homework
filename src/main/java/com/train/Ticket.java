package com.train;

public class Ticket {
    int tickets;
    int round_trip_tickets;


    public Ticket(int tickets, int round_trip_tickets) {
        this.tickets = tickets;
        this.round_trip_tickets = round_trip_tickets;
    }

    public int total(){
        int total = (int) ((tickets-round_trip_tickets)*1000+round_trip_tickets*2000*0.9);
        return total;
    }
}
