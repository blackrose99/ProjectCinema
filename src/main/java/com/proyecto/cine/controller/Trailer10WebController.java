package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer10WebController {

	@GetMapping("/trailer10")
    public String trailer10() {
        return "trailer10";
	}
}
