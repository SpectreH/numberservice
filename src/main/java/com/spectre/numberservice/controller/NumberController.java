package com.spectre.numberservice.controller;

import com.spectre.numberservice.dto.NumberDto;
import com.spectre.numberservice.service.NumberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class NumberController {
    private final NumberService numberService;

    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @PostMapping
    public ResponseEntity<String> saveNumbers(@RequestBody NumberDto numberDto) {
        numberService.saveNumbers(numberDto.getNumbers());
        return ResponseEntity.ok("Numbers saved successfully.");
    }
}