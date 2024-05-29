package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Estreno7WebController {

	@GetMapping("/estreno7")
    public String estreno7() {
        return "estreno7";
	}
}
