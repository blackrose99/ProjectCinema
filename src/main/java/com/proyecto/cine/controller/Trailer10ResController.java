package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer10")
public class Trailer10ResController {

	@GetMapping("/trailer10")
    public String getTrailer10() {
        return "trailer10";
	}
}