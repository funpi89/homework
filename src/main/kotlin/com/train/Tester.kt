package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var round_trip_tickets = scanner.nextInt()
    val tk = Ticket(ticket,round_trip_tickets)

    println("Total tickets: "+ticket);
    println("Round-trip: "+round_trip_tickets);
    println("Total: "+tk.total());

}

class Ticket(var ticket : Int,var round_trip_tickets : Int){
    fun total() : Int{
        return ((ticket-round_trip_tickets)*1000+round_trip_tickets*2000*0.9).toInt()
    }
}