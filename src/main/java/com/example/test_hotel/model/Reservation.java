package com.example.test_hotel.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reservationStart")
    @NotNull
    private String reservationStart;
    @Column(name = "reservationEnd")
    @NotNull
    private String reservationEnd;


    @ManyToOne
    private  Client client;


    @ManyToOne
    private Room room;

    public Reservation(String reservationStart, String reservationEnd) {
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
    }
}
