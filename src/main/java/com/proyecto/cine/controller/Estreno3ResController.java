package com.proyecto.cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estreno3")
public class Estreno3ResController {

	@GetMapping("/estreno3")
    public String getEstreno3() {
        return "estreno3";
	}
}