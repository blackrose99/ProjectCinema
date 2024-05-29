package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer15WebController {

	@GetMapping("/trailer15")
    public String trailer15() {
        return "trailer15";
	}
}
