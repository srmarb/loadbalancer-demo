package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/instore/v1/payin")
public class HomeController {

    @Value("${test}")
    private String test;
    private static Integer counter = 0;

    @PostMapping
    public ResponseEntity<?> test(@RequestBody Person person) {
        counter++;
        if(counter % 2 == 0){
            log.info(person.toString());
            log.info("service 1 executed and returning success");
            return ResponseEntity.ok(person);
        }
        log.info("service 1 executed and returning i am a teapot ---");
        return new ResponseEntity(HttpStatus.I_AM_A_TEAPOT);
    }

}
