package com.esignature.starterkit.generics;

public class GenereicObejct {

	private String name;
	private String lastname;
	private String requestSignature;

	public GenereicObejct() {

	}

	public GenereicObejct(String name, String lastname, String requestSignature) {
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

	@Override
	public String toString() {
		return "GenereicObejct [name=" + name + ", lastname=" + lastname + "]";
	}

}
