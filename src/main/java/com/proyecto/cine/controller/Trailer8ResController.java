package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer8")
public class Trailer8ResController {

	@GetMapping("/trailer8")
    public String getTrailer8() {
        return "trailer8";
	}
}