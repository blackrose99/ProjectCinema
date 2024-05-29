package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer4")
public class Trailer4ResController {

	@GetMapping("/trailer4")
    public String getTrailer4() {
        return "trailer4";
	}
}