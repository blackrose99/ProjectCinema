package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer16")
public class Trailer16ResController {

	@GetMapping("/trailer16")
    public String getTrailer16() {
        return "trailer16";
	}
}