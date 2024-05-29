package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer6WebController {

	@GetMapping("/trailer6")
    public String trailer6() {
        return "trailer6";
	}
}
