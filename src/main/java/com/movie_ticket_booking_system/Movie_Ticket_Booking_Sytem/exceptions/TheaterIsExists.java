package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions;

public class TheaterIsExists extends RuntimeException{
    private static final long serialVersionUID = 6386810783666583528L;

    public TheaterIsExists() {
        super("Theater is already Present on this Address");
    }
}
