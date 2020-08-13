package com.esignature.starterkit.generics;

public class GenericObject {

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

}
