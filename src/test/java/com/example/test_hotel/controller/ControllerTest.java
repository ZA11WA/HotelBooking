package com.example.test_hotel.controller;

import com.example.test_hotel.model.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void homePage() {
        Controller controller=new Controller();
        String response = controller.homePage();
        assertEquals("index", response);
    }



}