package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/instore/payin")
public class HomeController {

    @Value("${test}")
    private String test;

    @PostMapping
    public ResponseEntity<?> test(@RequestBody Person person) {
        log.info(person.toString());
        log.info("service 2 executed and returning success");
        return ResponseEntity.ok().header("service", "service-2").body(person);
    }

}
