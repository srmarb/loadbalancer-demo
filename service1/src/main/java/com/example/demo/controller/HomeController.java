package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
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
    private static Integer counter = 0;

    @GetMapping
    public ResponseEntity<?> test() {
        counter++;
        if(counter % 2 == 0){
            log.info("service 1 executed and returning success");
            return ResponseEntity.ok("OK" + test);
        }
        log.info("service 1 executed and returning permanent redirect");
        return new ResponseEntity(HttpStatus.PERMANENT_REDIRECT);
    }

}
