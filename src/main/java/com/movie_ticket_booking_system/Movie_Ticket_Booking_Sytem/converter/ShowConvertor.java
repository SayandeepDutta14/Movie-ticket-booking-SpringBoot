package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.converter;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Show;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.request.ShowRequest;

public class ShowConvertor {
    public static Show showDtoToShow(ShowRequest showRequest){
        Show show= Show.builder()
                .time(showRequest.getShowStartTime())
                .date(showRequest.getShowDate())
                .build();
        return  show;
    }
}
