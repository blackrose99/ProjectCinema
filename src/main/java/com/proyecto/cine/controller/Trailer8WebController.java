package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer8WebController {

	@GetMapping("/trailer8")
    public String trailer8() {
        return "trailer8";
	}
}
