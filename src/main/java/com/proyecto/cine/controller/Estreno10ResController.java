package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno10")
public class Estreno10ResController {

	@GetMapping("/estreno10")
    public String getEstreno10() {
        return "estreno10";
	}
}