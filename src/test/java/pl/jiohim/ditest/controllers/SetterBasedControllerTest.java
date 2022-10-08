package pl.jiohim.ditest.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jiohim.ditest.services.ConstructorGreetingService;

class SetterBasedControllerTest {

    SetterBasedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterBasedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println( controller.getGreeting());
    }
}