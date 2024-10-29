package com.cdfcblank.nutritionapp_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    
    @GetMapping("/default")
    public ResponseEntity<String> checkDefault() {
        return new ResponseEntity<>("Service is up and running!", HttpStatus.OK);
    }

}
