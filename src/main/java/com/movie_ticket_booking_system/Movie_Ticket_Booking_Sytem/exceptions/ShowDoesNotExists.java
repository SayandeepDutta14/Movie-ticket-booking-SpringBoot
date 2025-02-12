package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions;

public class ShowDoesNotExists extends RuntimeException{
    private static final long serialVersionUID = -4436119261176031165L;

    public ShowDoesNotExists() {
        super("Show does not exists");
    }
}
