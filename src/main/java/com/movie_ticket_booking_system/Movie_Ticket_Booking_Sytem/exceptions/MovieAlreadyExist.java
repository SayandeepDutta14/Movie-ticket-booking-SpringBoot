package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions;

import java.io.Serial;

public class MovieAlreadyExist extends RuntimeException {
    @Serial
    private static final long serialVersionUID= 8721071728310561L;
    public MovieAlreadyExist(){
        super("Movie is already exists with same name and language");
    }
}
