package com.argentina.programa.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity (name = "educacion_formal")
public class EducacionFormal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String titulo;
    private Date fecha_inicio;
    private Date fecha_fin;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    // The value for persona_id is harcoded to the value 1 because, for now, this template will be used only for one person.
    private Long persona_id = 1L;
    private Long empresa_institucion_id;

    public EducacionFormal() {
    }

    public EducacionFormal(Long id, String titulo, Date fecha_inicio, Date fecha_fin, String descripcion, Long empresa_institucion_id) {
        this.id = id;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.empresa_institucion_id = empresa_institucion_id;
    }
}
