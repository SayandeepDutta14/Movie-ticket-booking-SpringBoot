package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.converter;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Theater;

public class TheaterConverter {
    public static Theater theaterDtoToTheater(TheaterRequest theaterRequest) {
        Theater theater = Theater.builder()
                .name(theaterRequest.getName())
                .address(theaterRequest.getAddress())
                .build();
        return theater;
    }
}
