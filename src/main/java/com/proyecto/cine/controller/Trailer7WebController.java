package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer7WebController {

	@GetMapping("/trailer7")
    public String trailer7() {
        return "trailer7";
	}
}
