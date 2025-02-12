package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.request;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.enums.Genre;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.enums.Language;
import lombok.Data;

import java.util.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double ratings;
    private Date releaseDate;
    private Genre genre;
    private Language language;

}
