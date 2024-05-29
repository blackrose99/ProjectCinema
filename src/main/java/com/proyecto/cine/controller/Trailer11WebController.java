package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer11WebController {

	@GetMapping("/trailer11")
    public String trailer11() {
        return "trailer11";
	}
}
