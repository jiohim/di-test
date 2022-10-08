package pl.jiohim.ditest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.jiohim.ditest.services.GreetingSrvice;

@Controller
public class ConstructorInjectedContorller {

    private final GreetingSrvice greetingSrvice;


    public ConstructorInjectedContorller(GreetingSrvice greetingSrvice) {
        this.greetingSrvice = greetingSrvice;
    }

    public String getGreeting(){
        return greetingSrvice.sayGreeting();

    }
}
