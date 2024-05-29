package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer3")
public class Trailer3ResController {

	@GetMapping("/trailer3")
    public String getTrailer3() {
        return "trailer";
	}
}