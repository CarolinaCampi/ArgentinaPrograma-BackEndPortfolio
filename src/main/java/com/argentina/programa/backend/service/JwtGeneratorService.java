package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Persona;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtGeneratorService implements IJwtGeneratorService {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${app.jwttoken.message}")
    private String message;

    @Override
    public Map<String, String> generateToken() {
        String jwtToken = Jwts.builder().setSubject("carolinaluciacampi")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, this.secret)
                .compact();

        Map<String, String> jwtTokenGen = new HashMap<>();
        jwtTokenGen.put("token", jwtToken);
        jwtTokenGen.put("message", this.message);

        return jwtTokenGen;
    }
}
