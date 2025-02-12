package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions;

public class TheaterIsNotExist extends RuntimeException{
    private static final long serialVersionUID = -80039152090012599L;

    public TheaterIsNotExist() {
        super("Theater is not present in this address");
    }
}
