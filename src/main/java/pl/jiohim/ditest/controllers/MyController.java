package pl.jiohim.ditest.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("hello World!");

        return "Hi folks!";
    }
}
