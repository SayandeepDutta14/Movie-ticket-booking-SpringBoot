package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.services;


import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.converter.MovieConvertor;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Movie;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.exceptions.MovieAlreadyExist;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.repositories.MovieRepository;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.request.MovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public String addMovie(MovieRequest movieRequest){
        Movie movieByName=movieRepository.findByMovieName(movieRequest.getMovieName());
        if(movieByName!=null && movieByName.getLanguage().equals(movieRequest.getLanguage())){
            throw new MovieAlreadyExist();
        }
        Movie movie= MovieConvertor.movieDToMovie(movieRequest);
        return "This movie has been added successfully";
    }
}
