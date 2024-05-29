package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trailer13")
public class Trailer13ResController {

	@GetMapping("/trailer13")
    public String getTrailer13() {
        return "trailer13";
	}
}