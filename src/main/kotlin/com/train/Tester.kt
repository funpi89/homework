package com.train

import java.util.*

fun main(args: Array<String>) {
    //val scanner = Scanner(System.`in`)
    var ticket = 0
    while (ticket != -1){
        print("Please enter number of tickets: ")
        //var ticket = scanner.nextInt()
        ticket = readLine()!!.toInt()
        if(ticket == -1){
            break
        }
        print("How many round-trip tickets: ")
        //var roundTripTickets = scanner.nextInt()
        var roundTripTickets = readLine()!!.toInt()
        val tk = Ticket(ticket,roundTripTickets)

        println("Total tickets: "+ticket);
        println("Round-trip: "+roundTripTickets);
        println("Total: "+tk.total());
    }


}

class Ticket(var ticket : Int,var roundTripTickets : Int){
    fun total() : Int{
        return ((ticket-roundTripTickets)*1000+roundTripTickets*2000*0.9).toInt()
    }
}