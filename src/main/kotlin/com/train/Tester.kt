package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTripTickets = scanner.nextInt()
    val tk = Ticket(ticket,roundTripTickets)

    println("Total tickets: "+ticket);
    println("Round-trip: "+roundTripTickets);
    println("Total: "+tk.total());

}

class Ticket(var ticket : Int,var roundTripTickets : Int){
    fun total() : Int{
        return ((ticket-roundTripTickets)*1000+roundTripTickets*2000*0.9).toInt()
    }
}