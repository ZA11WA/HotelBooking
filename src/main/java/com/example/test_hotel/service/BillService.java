package com.example.test_hotel.service;

import com.example.test_hotel.model.Bill;
import com.example.test_hotel.model.Reservation;
import com.example.test_hotel.repostiry.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public void addBill(Bill bill) {
        this.billRepository.save(bill);
    }

}
