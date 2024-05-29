package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer14WebController {

	@GetMapping("/trailer14")
    public String trailer14() {
        return "trailer14";
	}
}
