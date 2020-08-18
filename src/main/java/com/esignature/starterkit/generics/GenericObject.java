package com.esignature.starterkit.generics;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.stereotype.Component;

import com.esignature.starterkit.hashing.HashingServiceI;

@Component
public class GenericObject implements HashingServiceI {

	private String name;
	private String lastname;
	private String requestSignature;

	public GenericObject() {

	}

	public GenericObject(String name, String lastname, String requestSignature) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.requestSignature = requestSignature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRequestSignature() {
		return requestSignature;
	}

	public void setRequestSignature(String requestSignature) {
		this.requestSignature = requestSignature;
	}

	@Override
	public String toString() {
		return "GenericObject [name=" + name + ", lastname=" + lastname + ", requestSignature=" + requestSignature
				+ "]";
	}

	@Override
	public String hashMyEsignature(byte[] requestSignature) throws NoSuchAlgorithmException, IOException {
		MessageDigest digester = MessageDigest.getInstance("Sha-256");
		digester.digest(requestSignature);
		return Base64.getEncoder().encodeToString(digester.digest());

	}

	@Override
	public String getMessageFrominterface(String myString) {
		return "MyMessage Has been received from Controler";
	}

}
