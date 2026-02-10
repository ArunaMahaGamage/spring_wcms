package com.aruna.wcms.utils;

import dev.paseto.jpaseto.Pasetos;
import dev.paseto.jpaseto.lang.Keys;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class PASETOTokenGenerator {

    public String createToken(String s) {

        SecretKey key = Keys.secretKey();

        // Create token
        String token = Pasetos.V1.LOCAL.builder()
                .setSharedSecret(key)
                .setIssuedAt(Instant.now())
                .setExpiration(Instant.now().plusSeconds(3600))
                .setSubject("user-123")
                .claim("role", "ADMIN")
                .compact();

        return token;
    }
}
