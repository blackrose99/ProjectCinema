package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer2")
public class Trailer2ResController {

	@GetMapping("/trailer2")
    public String getTrailer2() {
        return "trailer2";
	}
}