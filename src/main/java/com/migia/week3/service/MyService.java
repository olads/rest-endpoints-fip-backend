package com.migia.week3.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    // Method to return a greeting message
    public String getGreeting() {
        return "Hello, welcome to the Spring Boot REST API!";
    }

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to reverse a string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to get the length of a string
    public int getStringLength(String input) {
        return input.length();
    }

    // Method to convert a string to uppercase
    public String toUppercase(String input) {
        return input.toUpperCase();
    }
}