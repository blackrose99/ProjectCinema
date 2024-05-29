package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class ConfiteriaWebController {

	@GetMapping("/confiteria")
    public String confiteria() {
        return "confiteria";
	}
}

