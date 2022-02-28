package com.psalqvist.sfgdi.controllers;

import com.psalqvist.sfgdi.services.GreetingServiceimpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceimpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}