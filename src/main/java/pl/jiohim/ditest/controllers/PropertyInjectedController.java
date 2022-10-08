package pl.jiohim.ditest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.jiohim.ditest.services.GreetingService;


@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertiGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();

    }
}
