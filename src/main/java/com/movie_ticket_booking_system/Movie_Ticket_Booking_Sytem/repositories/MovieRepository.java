package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.repositories;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByMovieName(String name);
}
