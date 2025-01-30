package com.migia.week3.controller;

import com.migia.week3.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    // Endpoint 1: Get a greeting message
    @GetMapping("/greet")
    public String greet() {
        return myService.getGreeting();
    }

    // Endpoint 2: Add two numbers
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return myService.add(a, b);
    }

    // Endpoint 3: Check if a number is even
    @GetMapping("/isEven")
    public boolean isEven(@RequestParam int number) {
        return myService.isEven(number);
    }

    // Endpoint 4: Reverse a string
    @GetMapping("/reverse")
    public String reverseString(@RequestParam String input) {
        return myService.reverse(input);
    }

    // Endpoint 5: Get the length of a string
    @GetMapping("/length")
    public int getStringLength(@RequestParam String input) {
        return myService.getStringLength(input);
    }

    // Endpoint 6: Convert a string to uppercase
    @GetMapping("/uppercase")
    public String toUppercase(@RequestParam String input) {
        return myService.toUppercase(input);
    }
}