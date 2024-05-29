package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer12")
public class Trailer12ResController {

	@GetMapping("/trailer12")
    public String getTrailer12() {
        return "trailer12";
	}
}