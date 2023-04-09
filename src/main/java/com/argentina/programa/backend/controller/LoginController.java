package com.argentina.programa.backend.controller;

import com.argentina.programa.backend.model.LoginRequest;
import com.argentina.programa.backend.service.IJwtGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    private IJwtGeneratorService jwtGen;


    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        try {
            if(loginRequest.getUserName() == null || loginRequest.getPassword() == null) {
                throw new Exception( "UserName or Password is Empty");
            }
            if (!loginRequest.getUserName().equals("carolinaluciacampi") ||
                    !loginRequest.getPassword().equals("password")){
                throw new Exception("UserName or Password is Invalid");
            }
            return new ResponseEntity<>(jwtGen.generateToken(), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
