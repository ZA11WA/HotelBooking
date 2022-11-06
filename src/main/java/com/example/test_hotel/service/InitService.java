package com.example.test_hotel.service;

import com.example.test_hotel.model.Client;
import com.example.test_hotel.model.Reservation;
import com.example.test_hotel.model.Room;
import com.example.test_hotel.repostiry.ClientRepository;
import com.example.test_hotel.repostiry.ReservationRepository;
import com.example.test_hotel.repostiry.RoomRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class InitService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    ReservationRepository reservationRepository;

    @PostConstruct
    public void init() {










    }
}
