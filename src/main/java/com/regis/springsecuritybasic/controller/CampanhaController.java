package com.regis.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/campanhas")
public class CampanhaController {

	@GetMapping(value = "")
	public void teste() {
		System.out.println("Teste");
	}
	
}