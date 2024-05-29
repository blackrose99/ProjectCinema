package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer6")
public class Trailer6ResController {

	@GetMapping("/trailer6")
    public String getTrailer6() {
        return "trailer6";
	}
}