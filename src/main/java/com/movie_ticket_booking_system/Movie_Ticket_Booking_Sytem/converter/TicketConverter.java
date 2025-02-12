package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.converter;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Show;
import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities.Ticket;

public class TicketConverter {
    public static TicketResponse returnTicket(Show show, Ticket ticket) {
        TicketResponse ticketResponseDto = TicketResponse.builder()
                .bookedSeats(ticket.getBookedSeats())
                .address(show.getTheater().getAddress())
                .theaterName(show.getTheater().getName())
                .movieName(show.getMovie().getMovieName())
                .date(show.getDate())
                .time(show.getTime())
                .totalPrice(ticket.getTotalTicketsPrice())
                .build();

        return ticketResponseDto;
    }
}
