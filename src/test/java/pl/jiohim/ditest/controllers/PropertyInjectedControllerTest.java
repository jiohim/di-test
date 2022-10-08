package pl.jiohim.ditest.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jiohim.ditest.services.GreetingSrviceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingSrvice = new GreetingSrviceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}