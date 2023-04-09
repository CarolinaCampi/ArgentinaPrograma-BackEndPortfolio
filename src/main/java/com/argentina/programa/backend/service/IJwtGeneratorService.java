package com.argentina.programa.backend.service;


import com.argentina.programa.backend.model.Persona;

import java.util.Map;

public interface IJwtGeneratorService {
    Map<String, String> generateToken();
}
