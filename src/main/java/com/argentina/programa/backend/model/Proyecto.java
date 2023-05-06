package com.argentina.programa.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity (name = "proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String titulo;
    private Date fecha_fin;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    @Column(columnDefinition = "TEXT")
    private String url_proyecto;
    // The value for persona_id is harcoded to the value 1 because, for now, this template will be used only for one person.
    private Long persona_id = 1L;


    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, Date fecha_fin, String descripcion, String url_proyecto) {
        this.id = id;
        this.titulo = titulo;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
    }
}
