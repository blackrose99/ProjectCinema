package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Trailer13WebController {

	@GetMapping("/trailer13")
    public String trailer13() {
        return "trailer13";
	}
}
