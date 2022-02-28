package com.psalqvist.sfgdi.controllers;

import com.psalqvist.sfgdi.services.GreetingServiceimpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceimpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}