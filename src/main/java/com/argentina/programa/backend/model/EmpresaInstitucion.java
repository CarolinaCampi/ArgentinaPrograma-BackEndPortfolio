package com.argentina.programa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity (name = "empresa_institucion")
public class EmpresaInstitucion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String url_logo;
    private String alt_text_logo;

    public EmpresaInstitucion() {
    }

    public EmpresaInstitucion(Long id, String nombre, String url_logo, String alt_text_logo) {
        this.id = id;
        this.nombre = nombre;
        this.url_logo = url_logo;
        this.alt_text_logo = alt_text_logo;
    }
}
