package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno4")
public class Estreno4ResController {

	@GetMapping("/estreno4")
    public String getEstreno3() {
        return "estreno4";
	}
}