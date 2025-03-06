package com.migia.week3.controller;

import com.migia.week3.dto.AddNumbersRequest;
import com.migia.week3.dto.IsEvenRequest;
import com.migia.week3.dto.StringRequest;
import com.migia.week3.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@Validated
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok(myService.getGreeting());
    }

    @GetMapping("/add")
    public ResponseEntity<Integer> addNumbers(@Valid AddNumbersRequest request) {
        return ResponseEntity.ok(myService.add(request.getA(), request.getB()));
    }

    @GetMapping("/isEven")
    public ResponseEntity<Boolean> isEven(@Valid IsEvenRequest request) {
        return ResponseEntity.ok(myService.isEven(request.getNumber()));
    }

    @GetMapping("/reverse")
    public ResponseEntity<String> reverseString(@Valid StringRequest request) {
        return ResponseEntity.ok(myService.reverse(request.getInput()));
    }

    @GetMapping("/length")
    public ResponseEntity<Integer> getStringLength(@Valid StringRequest request) {
        return ResponseEntity.ok(myService.getStringLength(request.getInput()));
    }

    @GetMapping("/uppercase")
    public ResponseEntity<String> toUppercase(@Valid StringRequest request) {
        return ResponseEntity.ok(myService.toUppercase(request.getInput()));
    }
}