package pl.jiohim.ditest.controllers;


import org.springframework.stereotype.Controller;
import pl.jiohim.ditest.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){


        return greetingService.sayGreeting();
    }
}
