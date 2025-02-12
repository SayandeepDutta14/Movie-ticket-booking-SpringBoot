package com.movie_ticket_booking_system.Movie_Ticket_Booking_Sytem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "THEATERS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    @Column(unique =true)
    private String address;
    @OneToMany(mappedBy ="theater", cascade = CascadeType.ALL)
    private List<TheaterSeat> theaterSeatList=new ArrayList<>();
    @OneToMany(mappedBy ="theater", cascade = CascadeType.ALL)
    private List<Show> showList=new ArrayList<>();
}
