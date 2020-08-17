package com.esignature.starterkit.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esignature.starterkit.generics.GenericObject;

@RestController
public class EsignatureRestController {

	// @Autowired
	// HashingServiceI myHashService;

	@GetMapping("/")
	public String printingStarterKit() {
		return "Hello Captain.....";
	}

	@GetMapping("/v1/generic")
	public GenericObject getGenericObject() {
		return new GenericObject("foo", "baar", "EsignatureHashed");
	}

	@PostMapping("/v1/generic")
	public String createGenerecObject() {
		return "Just submitted a new record";
	}

}
