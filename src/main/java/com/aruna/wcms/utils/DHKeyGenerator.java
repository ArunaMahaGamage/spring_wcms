package com.aruna.wcms.utils;

import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class DHKeyGenerator {

    public static void main(String[] args) throws Exception {
        // 1. Get KeyPairGenerator instance for DiffieHellman
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DiffieHellman");

        // 2. Initialize with a secure key size (e.g., 2048 bits)
        keyPairGen.initialize(2048);

        // 3. Generate the key pair
        KeyPair keyPair = keyPairGen.generateKeyPair();

        // 4. Extract public and private keys
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        //System.out.println("Public Key Format: " + publicKey.getFormat());
        //System.out.println("Private Key Format: " + privateKey.getFormat());

        // Print key information (for demonstration purposes)
        System.out.println("Public Key Algorithm: " + publicKey.getAlgorithm());
        System.out.println("Public Key Format: " + publicKey.getFormat());
        System.out.println("Private Key Algorithm: " + privateKey.getAlgorithm());
        System.out.println("Private Key Format: " + privateKey.getFormat());

        // You can also cast the generic keys to DHPublicKey and DHPrivateKey
        // to access specific DH parameters like 'p', 'g', 'Y' (public value) and 'X' (private value)
        DHPublicKey dhPublicKey = (DHPublicKey) publicKey;
        DHPrivateKey dhPrivateKey = (DHPrivateKey) privateKey;

        System.out.println("\nDH Public Value (Y): " + dhPublicKey.getY());
        System.out.println("DH Private Value (X): " + dhPrivateKey.getX());

    }
}
