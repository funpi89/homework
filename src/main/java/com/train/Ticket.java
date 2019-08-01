package com.train;

public class Ticket {
    int tickets;
    int roundTripTickets;


    public Ticket(int tickets, int round_trip_tickets) {
        this.tickets = tickets;
        this.roundTripTickets = round_trip_tickets;
    }

    public int total(){
        int total = (int) ((tickets-roundTripTickets)*1000+roundTripTickets*2000*0.9);
        return total;
    }
}
