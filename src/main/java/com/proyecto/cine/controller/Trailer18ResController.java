package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer18")
public class Trailer18ResController {

	@GetMapping("/trailer18")
    public String getTrailer18() {
        return "trailer18";
	}
}