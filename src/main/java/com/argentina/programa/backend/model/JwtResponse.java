package com.argentina.programa.backend.model;

import java.io.Serial;
import java.io.Serializable;

public class JwtResponse implements Serializable {

    //The serialVersionUID attribute is an identifier that is used to serialize/deserialize an object of a Serializable class.
    //The SerialVersionUID can be used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible w.r.t serialization. If the deserialization object is different than serialization, then it can throw an InvalidClassException.
    @Serial
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
