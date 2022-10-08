package pl.jiohim.ditest.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jiohim.ditest.services.ConstructorGreetingService;

class ConstructorInjectedContorllerTest {

    ConstructorInjectedContorller contorller;

    @BeforeEach
    void setUp() {
        contorller = new ConstructorInjectedContorller(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(contorller.getGreeting());
    }
}