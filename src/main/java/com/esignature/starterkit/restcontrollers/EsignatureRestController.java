package com.esignature.starterkit.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esignature.starterkit.generics.GenericObject;
import com.esignature.starterkit.hashing.HashingServiceI;

@RestController
public class EsignatureRestController {

	@Autowired
	HashingServiceI myHashService;

	@GetMapping("/")
	public String printingStarterKit() {
		return "Hello Captain.....";
	}

	@GetMapping("/v1/generic")
	public GenericObject getGenericObject() {
		String resultFromInterface = myHashService.getMessageFrominterface("This is My messagge");
		return new GenericObject("foo", resultFromInterface, "EsignatureHashed");
	}

	@PostMapping("/v1/generic")
	public String createGenericObject() {
		return "Just submitted a new record";
	}

}
