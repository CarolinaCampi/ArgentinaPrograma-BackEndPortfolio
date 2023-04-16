package com.argentina.programa.backend.config;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil implements Serializable {

    //The serialVersionUID attribute is an identifier that is used to serialize/deserialize an object of a Serializable class.
    //The SerialVersionUID can be used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible w.r.t serialization. If the deserialization object is different than serialization, then it can throw an InvalidClassException.
    @Serial
    private static final long serialVersionUID = -2550185165626007488L;

    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

    // Injection of value from app properties
    @Value("${jwt.secret}")
    private String jwtSecret;

   private Algorithm getAlgorithm(String secret){
        return Algorithm.HMAC256(secret);
    }

    //retrieve username from jwt token
    public String getUsernameFromToken(String token) {
        JWTVerifier verifier = JWT.require(getAlgorithm(jwtSecret))
                //.withIssuer("Carolina")
                .build();
        DecodedJWT decoded = verifier.verify(token);

        return decoded.getSubject();
    }

    //retrieve expiration date from jwt token
    public Date getExpirationDateFromToken(String token) {
        JWTVerifier verifier = JWT.require(getAlgorithm(jwtSecret))
                //.withIssuer("Carolina")
                .build();
        DecodedJWT decoded = verifier.verify(token);

        return decoded.getExpiresAt();
    }
    //check if the token has expired
    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    //generate token for user
    public String generateToken(UserDetails userDetails) {
        return doGenerateToken(userDetails.getUsername());
    }

    //while creating the token
    //1. Define  claims of the token, like Issuer, Expiration, Subject, and the ID (when needed)
    //2. Sign the JWT using the HS512 algorithm and secret key.
    //3. According to JWS Compact Serialization(https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
    //   compaction of the JWT to a URL-safe string
    private String doGenerateToken(String subject) {
        return JWT.create()
                .withSubject(subject)
                //.withIssuer("Carolina")
                //.withClaim("userId", "1234")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
                .withJWTId(UUID.randomUUID().toString())
                .withNotBefore(new Date(System.currentTimeMillis() + 1000L))
                .sign(getAlgorithm(jwtSecret));
    }

    //validate token
    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }}
