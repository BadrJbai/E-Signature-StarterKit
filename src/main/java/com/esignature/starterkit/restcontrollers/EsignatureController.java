package com.esignature.starterkit.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esignature.starterkit.generics.GenericObject;

@RestController
public class EsignatureController {

	@RequestMapping("/")
	public String printingStarterKit() {
		return "Hello Captain.....";
	}

	@RequestMapping("/generic")
	public GenericObject getGenericObject() {
		return new GenericObject("foo", "baar", "Esignature");
	}
}
