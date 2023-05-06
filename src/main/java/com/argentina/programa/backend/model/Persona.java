package com.argentina.programa.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String apellido;
    @Column(columnDefinition = "TEXT")
    private String domicilio;
    @Column(columnDefinition = "TEXT")
    private String posicion;
    private String telefono;
    private String correo;
    @Column(columnDefinition = "TEXT")
    private String sobre_mi;
    @Column(columnDefinition = "TEXT")
    private String url_foto;
    @Column(columnDefinition = "TEXT")
    private String url_banner;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String domicilio, String posicion, String telefono, String correo, String sobre_mi, String url_foto, String url_banner) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.posicion = posicion;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
    }


}
