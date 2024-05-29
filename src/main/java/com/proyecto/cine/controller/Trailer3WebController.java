package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer3WebController {

	@GetMapping("/trailer3")
    public String trailer3() {
        return "trailer3";
	}
}
