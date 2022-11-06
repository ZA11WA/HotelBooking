package com.example.test_hotel.controller;

import com.example.test_hotel.model.Bill;
import com.example.test_hotel.model.Client;
import com.example.test_hotel.model.Reservation;
import com.example.test_hotel.model.Room;
import com.example.test_hotel.repostiry.ClientRepository;
import com.example.test_hotel.service.BillService;
import com.example.test_hotel.service.ClientService;
import com.example.test_hotel.service.ReservationService;
import com.example.test_hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private RoomService roomService;

    @Autowired
    private BillService billService;



    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/client")
    public String getAllClients(Model model,Model model2){
        model.addAttribute("clientList",clientService.getAllClients());
        Client client = new Client();
        model2.addAttribute("newClient",client);
        return "client";
    }

    @PostMapping("/addClient")
    public String saveClient(@ModelAttribute("newClient")Client client){
        clientService.addClient(client);
        return "redirect:/client";
    }

    @GetMapping("/reservation")
    public String showReservation(Model model,Model model2){
        model.addAttribute("reservationList",reservationService.getAllReservations());
        Reservation reservation = new Reservation();
        model2.addAttribute("newReservation",reservation);
        return "reservation";
    }


    @PostMapping("/addReservation")
    public String saveReservation(@ModelAttribute("newReservation")Reservation reservation){
        reservationService.addReservation(reservation);
        return "redirect:/reservation";
    }
    @GetMapping("/room")
    public String showRoom(Model model,Model model2){
        model.addAttribute("roomList",roomService.getAllRooms());
        Room room = new Room();
        model2.addAttribute("newRoom",room);
        return "room";
    }

    @PostMapping("/addRoom")
    public String saveRoom(@ModelAttribute("newRoom")Room room){
        roomService.addRoom(room);
        return "redirect:/room";
    }
    @GetMapping("/bill")
    public String getAllBills(Model model,Model model2){
        model.addAttribute("billList",billService.getAllBills());
        Bill bill = new Bill();
        model2.addAttribute("newBill",bill);
        return "bill";
    }

    @PostMapping("/addBill")
    public String saveBill(@ModelAttribute("newBill")Bill bill){
        billService.addBill(bill);
        return "redirect:/bill";
    }
    @GetMapping("/info")
    public String info(){
        return "info";
    }

    @GetMapping("/yourRoom")
    public String showRoomYouWant(Model model, Model model2){

        model.addAttribute("roomListYoWant",roomService.getRoomYouWant("2",false    ,true));
        Room room = new Room();

        return "yourRoom";
    }
    @PostMapping("/addYourRoom")
    public String saveYourRoom(@ModelAttribute("newRoom")Room room){
        roomService.addRoom(room);
        return "redirect:/yourRoom";
    }



}
