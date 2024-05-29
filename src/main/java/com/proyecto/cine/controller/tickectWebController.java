package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tickectWebController {

	@GetMapping("/tickect")
    public String tickect() {
        return "tickect";
	}
}
