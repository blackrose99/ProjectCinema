package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer7")
public class Trailer7ResController {

	@GetMapping("/trailer7")
    public String getTrailer7() {
        return "trailer7";
	}
}