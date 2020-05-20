package com.chrisworks.bot.yizsellfbbot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

    @GetMapping(path = "home")
    public ResponseEntity<?> testAPI(){
        return ResponseEntity.ok("Test API is functional");
    }
}
