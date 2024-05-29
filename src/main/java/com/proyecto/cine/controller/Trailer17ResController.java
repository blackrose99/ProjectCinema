package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer17")
public class Trailer17ResController {

	@GetMapping("/trailer17")
    public String getTrailer17() {
        return "trailer17";
	}
}