package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions;

public class MovieDoesNotExists extends RuntimeException {
    private static final long serialVersionUID = -5385129013790060351L;

    public MovieDoesNotExists() {
        super("Movie dose not Exists");
    }
}
