package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.repositories;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Theater;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
    Theater findByAddress(String address);
}