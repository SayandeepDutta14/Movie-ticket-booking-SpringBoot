package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.converter;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Movie;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.request.MovieRequest;

public class MovieConvertor {
    public  static Movie movieDToMovie(MovieRequest movieRequest){
        Movie movie=Movie.builder()
                .movieName(movieRequest.getMovieName())
                .duration(movieRequest.getDuration())
                .genre(movieRequest.getGenre())
                .language(movieRequest.getLanguage())
                .releaseDate(movieRequest.getReleaseDate())
                .rating(movieRequest.getRatings())
                .build();
        return  movie;
    }
}
