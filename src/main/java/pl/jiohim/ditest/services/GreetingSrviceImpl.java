package pl.jiohim.ditest.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingSrviceImpl implements GreetingSrvice {
    @Override
    public String sayGreeting() {
        return "HelloWorld";
    }
}
