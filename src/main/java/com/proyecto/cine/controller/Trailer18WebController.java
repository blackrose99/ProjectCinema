package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer18WebController {

	@GetMapping("/trailer18")
    public String trailer18() {
        return "trailer18";
	}
}
