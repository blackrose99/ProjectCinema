package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrailerWebController {

	@GetMapping("/trailer")
    public String trailer() {
        return "trailer";
	}
}
