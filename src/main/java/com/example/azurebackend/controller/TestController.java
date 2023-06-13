package com.example.azurebackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class TestController {

    @GetMapping("/home")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/test")
    public ResponseEntity<String> testMethod() {
        return ResponseEntity.ok("Singhaniya Aman");
    }
}
