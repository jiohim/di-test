package pl.jiohim.ditest.services;


import org.springframework.stereotype.Service;

@Service
public class PropertiGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello World - property";
    }
}
