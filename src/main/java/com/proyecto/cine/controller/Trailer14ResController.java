package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer14")
public class Trailer14ResController {

	@GetMapping("/trailer14")
    public String getTrailer14() {
        return "trailer14";
	}
}