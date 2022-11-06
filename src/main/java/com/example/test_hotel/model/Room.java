package com.example.test_hotel.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Room")
@Data

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="number")
    @NotNull
    private String number;
    @Column(name="capacity")
    @NotNull
    private String capacity;

    @Column(name="air")
    @NotNull
    private Boolean air;

    @Column(name="seaView")
    @NotNull
    private Boolean seaView;
    @Column(name="price")
    @NotNull
    private Long price;

    public Room() {
    }

    public Room(String number, String capacity, Boolean air, Boolean seaView, Long price) {
        this.number = number;
        this.capacity = capacity;
        this.air = air;
        this.seaView = seaView;
        this.price = price;
    }

    public Room(Long id, String number, String capacity, Boolean air, Boolean seaView, Long price) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
        this.air = air;
        this.seaView = seaView;
        this.price = price;
    }
}
