package com.springpost.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springpost.api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @PostMapping
    public void create(@RequestBody CarDTO body) {
        System.out.println(body.modelo());
        System.out.println(body.dataFabricacao());
    }
}
