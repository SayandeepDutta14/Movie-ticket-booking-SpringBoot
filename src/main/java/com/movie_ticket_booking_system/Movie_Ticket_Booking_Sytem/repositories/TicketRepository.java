package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.repositories;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
