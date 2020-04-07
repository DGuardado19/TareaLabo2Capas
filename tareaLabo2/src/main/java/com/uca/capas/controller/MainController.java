package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {

	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "MLogin";
	}
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		if(usuario.getUser().equals("admin") && usuario.getPassword().equals("root")) {
			return "MostrarMensajeV";
		} else {
			return "MostrarMensajeF";
		}
		
	}

}
