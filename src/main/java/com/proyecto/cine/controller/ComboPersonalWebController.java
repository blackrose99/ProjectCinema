package com.proyecto.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComboPersonalWebController {

	@GetMapping("/combo-personal")
    public String ComboPersonal() {
        return "combo-personal";
	}
}
