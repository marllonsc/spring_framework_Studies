package com.msc.spring.springcore.lc.activity;

public class TicketReservation {

    public void initialize(){
        System.out.println("Inside method initialize doing now...");
    }

    public void cleanUP(){
        System.out.println("Inside method cleanUP closed.");
    }

    @Override
    public String toString() {
        return "TicketReservation Class";
    }
}
