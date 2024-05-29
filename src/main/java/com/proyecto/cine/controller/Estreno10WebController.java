package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno10WebController {

	@GetMapping("/estreno10")
    public String estreno10() {
        return "estreno10";
	}
}
