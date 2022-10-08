package pl.jiohim.ditest.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jiohim.ditest.services.GreetingSrviceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterBasedController();
        controller.setGreetingSrvice(new GreetingSrviceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println( controller.getGreeting());
    }
}