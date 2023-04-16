package com.argentina.programa.backend.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    // Injection of value from app properties
    @Value("${jwt.username}")
    private String jwtUsername;
    // Injection of value from app properties
    @Value("${jwt.password}")
    private String jwtPassword;

    // Retrieval of user details
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (jwtUsername.equals(username)) {
            return new User(jwtUsername, new BCryptPasswordEncoder().encode(jwtPassword),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
