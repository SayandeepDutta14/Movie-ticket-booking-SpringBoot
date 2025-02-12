package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.repositories;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmailId(String emailId);

}
