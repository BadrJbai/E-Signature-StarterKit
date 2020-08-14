package com.esignature.starterkit.hashing;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public interface HashingServiceI {

	public static String hashMyEsignature(byte[] requestSignature) throws NoSuchAlgorithmException, IOException {
		MessageDigest digester = MessageDigest.getInstance("Sha-256");
		digester.digest(requestSignature);
		return Base64.getEncoder().encodeToString(digester.digest());
	}

}
