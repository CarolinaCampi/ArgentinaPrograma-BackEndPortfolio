package com.argentina.programa.backend.config;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    //The serialVersionUID attribute is an identifier that is used to serialize/deserialize an object of a Serializable class.
    //The SerialVersionUID can be used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible w.r.t serialization. If the deserialization object is different than serialization, then it can throw an InvalidClassException.
    @Serial
    private static final long serialVersionUID = -7858869558953243875L;


    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        // Next three lines added to understand how the process works:
        //System.out.println("Pasamos por JwtAuthenticationEntryPoint");
        //System.out.println(authException.getMessage());
        //authException.printStackTrace();

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
