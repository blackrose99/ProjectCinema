package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer9WebController {

	@GetMapping("/trailer9")
    public String trailer9() {
        return "trailer9";
	}
}
