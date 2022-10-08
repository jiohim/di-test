package pl.jiohim.ditest.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.jiohim.ditest.services.GreetingService;

@Controller
public class ConstructorInjectedContorller {

    private final GreetingService greetingService;


    public ConstructorInjectedContorller(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();

    }
}
