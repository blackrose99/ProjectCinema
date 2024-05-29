package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer5")
public class Trailer5ResController {

	@GetMapping("/trailer5")
    public String getTrailer5() {
        return "trailer5";
	}
}