package pl.jiohim.ditest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.jiohim.ditest.services.GreetingSrvice;


@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingSrvice greetingSrvice;

    public String getGreeting(){
        return greetingSrvice.sayGreeting();

    }
}
