package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer11")
public class Trailer11ResController {

	@GetMapping("/trailer11")
    public String getTrailer11() {
        return "trailer11";
	}
}