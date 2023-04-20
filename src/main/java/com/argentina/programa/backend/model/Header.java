package com.argentina.programa.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String url_logo_pagina;
    private String titulo_pagina;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Persona per;

    public Header() {
    }

    public Header(Long id, String url_logo_pagina, String titulo_pagina, Persona per) {
        this.id = id;
        this.url_logo_pagina = url_logo_pagina;
        this.titulo_pagina = titulo_pagina;
        this.per = per;
    }
}
