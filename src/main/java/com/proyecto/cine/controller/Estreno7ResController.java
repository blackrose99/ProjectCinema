package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno7")
public class Estreno7ResController {

	@GetMapping("/estreno7")
    public String getEstreno7() {
        return "estreno7";
	}
}