package com.argentina.programa.backend.model;

import java.io.Serial;
import java.io.Serializable;

public class JwtRequest implements Serializable {

    //The serialVersionUID attribute is an identifier that is used to serialize/deserialize an object of a Serializable class.
    //The SerialVersionUID can be used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible w.r.t serialization. If the deserialization object is different than serialization, then it can throw an InvalidClassException.
    @Serial
    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;

    //need default constructor for JSON Parsing
    public JwtRequest()
    {

    }

    public JwtRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
