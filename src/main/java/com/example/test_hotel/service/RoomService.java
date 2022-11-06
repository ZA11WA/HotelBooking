package com.example.test_hotel.service;

import com.example.test_hotel.model.Client;
import com.example.test_hotel.model.Room;
import com.example.test_hotel.repostiry.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
    public void addRoom(Room room) {
        this.roomRepository.save(room);
    }
    public List<Room> findAir(){
        return roomRepository.findAll().stream()
                .filter(room-> room.getAir()!=false)
                .collect(Collectors.toList());

    }
    public List<Room> findView(){
        return roomRepository.findAll().stream()
                .filter(room-> room.getSeaView()!=false)
                .collect(Collectors.toList());

    }
    public List<Room> getRoomYouWant(String capaCity, Boolean seaView, Boolean air) {
        return roomRepository.findAll().stream()
                .filter(room -> room.getCapacity().equals(capaCity))
                .filter(room -> room.getSeaView()==seaView)
                .filter(room -> room.getAir()==air)
                .sorted(Comparator.comparing(Room::getPrice))
                .collect(Collectors.toList());
    }


}
