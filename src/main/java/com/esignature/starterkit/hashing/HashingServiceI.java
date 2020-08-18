package com.esignature.starterkit.hashing;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.springframework.context.annotation.Bean;

public interface HashingServiceI {

	public String hashMyEsignature(byte[] requestSignature) throws NoSuchAlgorithmException, IOException;

	@Bean
	public String getMessageFrominterface(String myString);

}
