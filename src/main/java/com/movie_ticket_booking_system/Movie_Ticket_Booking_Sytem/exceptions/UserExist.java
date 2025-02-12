package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions;

public class UserExist extends RuntimeException {
    private static final long serialVersionUID = -4666349320340656440L;

    public UserExist() {
        super("User Already Exists with this EmailId");
    }
}
