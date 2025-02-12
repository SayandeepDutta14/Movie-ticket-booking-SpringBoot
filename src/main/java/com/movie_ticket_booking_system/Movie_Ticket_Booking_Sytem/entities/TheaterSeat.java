package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="THEATER_SEATS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String seatNo;
    @Enumerated(value=EnumType.STRING)
    private SeatType seatType;
    @ManyToOne
    @JoinColumn
    private Theater theater;
}
