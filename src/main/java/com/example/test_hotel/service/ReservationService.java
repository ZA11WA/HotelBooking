package com.example.test_hotel.service;

import com.example.test_hotel.model.Client;
import com.example.test_hotel.model.Reservation;
import com.example.test_hotel.repostiry.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
    public void addReservation(Reservation reservation) {
        this.reservationRepository.save(reservation);
    }
}
