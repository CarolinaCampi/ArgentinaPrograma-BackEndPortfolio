package com.argentina.programa.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity (name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String titulo;
    private Date fecha_fin;
    // The value for persona_id is harcoded to the value 1 because, for now, this template will be used only for one person.
    private Long persona_id = 1L;
    private Long empresa_institucion_id;

    public Curso() {
    }

    public Curso(Long id, String titulo, Date fecha_fin, Long empresa_institucion_id) {
        this.id = id;
        this.titulo = titulo;
        this.fecha_fin = fecha_fin;
        this.empresa_institucion_id = empresa_institucion_id;
    }
}
