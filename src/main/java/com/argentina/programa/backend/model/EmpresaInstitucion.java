package com.argentina.programa.backend.model;

import jakarta.persistence.*;
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

    @Column(columnDefinition = "TEXT")
    private String nombre;
    @Column(columnDefinition = "TEXT")
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
