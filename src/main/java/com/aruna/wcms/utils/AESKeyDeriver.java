package com.aruna.wcms.utils;

import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;

public class AESKeyDeriver {

    public static SecretKeySpec generateAESKey(PrivateKey myPrivateKey, PublicKey theirPublicKey) throws Exception {
        // 1. Initialize KeyAgreement with your private key
        KeyAgreement keyAgree = KeyAgreement.getInstance("DiffieHellman");
        keyAgree.init(myPrivateKey);

        // 2. Add the other party's public key
        keyAgree.doPhase(theirPublicKey, true);

        // 3. Generate the raw shared secret
        byte[] sharedSecret = keyAgree.generateSecret();

        // 4. Hash the secret to derive a fixed-length AES-256 key
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] derivedKeyBytes = sha256.digest(sharedSecret);

        // 5. Create the AES SecretKeySpec
        return new SecretKeySpec(derivedKeyBytes, "AES");
    }
}
