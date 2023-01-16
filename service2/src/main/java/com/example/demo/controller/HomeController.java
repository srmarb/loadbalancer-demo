package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{id}")
public class HomeController {

    @Value("${test}")
    private String test;

    @GetMapping
    public ResponseEntity<?> test(@PathVariable final Integer id) {
        if(id == 10) {
            return new ResponseEntity(HttpStatus.I_AM_A_TEAPOT);
        }
        return ResponseEntity.ok("OK" + test);
    }

}
