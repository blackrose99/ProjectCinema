package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer17WebController {

	@GetMapping("/trailer17")
    public String trailer17() {
        return "trailer17";
	}
}
