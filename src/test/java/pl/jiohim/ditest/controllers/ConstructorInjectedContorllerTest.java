package pl.jiohim.ditest.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jiohim.ditest.services.GreetingSrviceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedContorllerTest {

    ConstructorInjectedContorller contorller;

    @BeforeEach
    void setUp() {
        contorller = new ConstructorInjectedContorller(new GreetingSrviceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(contorller.getGreeting());
    }
}