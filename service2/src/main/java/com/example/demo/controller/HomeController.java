package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${test}")
    private String test;

    @GetMapping
    public ResponseEntity<?> test() {
        log.info("service 2 executed and returning success");
        return ResponseEntity.ok("OK " + test);
    }

}
