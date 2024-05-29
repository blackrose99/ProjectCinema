package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer9")
public class Trailer9ResController {

	@GetMapping("/trailer9")
    public String getTrailer9() {
        return "trailer9";
	}
}