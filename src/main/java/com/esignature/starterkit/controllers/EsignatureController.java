package com.esignature.starterkit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class EsignatureController {

	@GetMapping
	public String printingStarterKit() {
		return "Hello Captain.....";
	}
}