package com.argentina.programa.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity (name = "experiencia_laboral")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String rol;
    private Long empresa_institucion_id;
    private boolean es_trabajo_actual;
    private Date fecha_inicio;
    private Date fecha_fin;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    // The value for persona_id is harcoded to the value 1 because, for now, this template will be used only for one person.
    private Long persona_id = 1L;


    public Experiencia() {
    }

    public Experiencia(Long id, String rol, Long empresa_institucion_id, boolean es_trabajo_actual, Date fecha_inicio, Date fecha_fin, String descripcion) {
        this.id = id;
        this.rol = rol;
        this.empresa_institucion_id = empresa_institucion_id;
        this.es_trabajo_actual = es_trabajo_actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }
}
