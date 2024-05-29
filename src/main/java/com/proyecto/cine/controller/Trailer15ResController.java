package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer15")
public class Trailer15ResController {

	@GetMapping("/trailer15")
    public String getTrailer15() {
        return "trailer15";
	}
}