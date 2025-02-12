package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities;

import com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Entity
@Table(name = "SHOW_SEATS")
@Data
public class ShowSeats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    private Integer price;
    private Boolean isAvailable;
    private Boolean isFoodContains;
    @ManyToOne
    @JoinColumn
    private Show show;
}
