package com.ejemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// Sistema de rutas (Recibe peticiones, carga recursos y envia respuesta a una vista)
@Controller
public class ViewController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("ei", "<i>Hola</i>");
		return "index";
	}
	
}
