package com.argentina.programa.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginRequest {
    private String userName;
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
