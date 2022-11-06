package com.example.test_hotel.service;

import com.example.test_hotel.model.Room;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {

    @Test
    void getRoomYouWant() {
        Room room = new Room("20","2",true,false, 100L);
        Room room1 = new Room("21","2",false,false, 100L);
        Room room2= new Room("22","3",true,false, 100L);
        Room room3 = new Room("23","4",true,false, 100L);
        List<Room> listrooms = new ArrayList<Room>();
        listrooms.add(room);
        listrooms.add(room1);
        listrooms.add(room2);
        listrooms.add(room3);
        



    }
}