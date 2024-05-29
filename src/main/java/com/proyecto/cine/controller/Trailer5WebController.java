package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer5WebController {

	@GetMapping("/trailer5")
    public String trailer5() {
        return "trailer5";
	}
}
