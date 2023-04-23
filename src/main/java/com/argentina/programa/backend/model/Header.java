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
    // porque esta hardodeado
    private Long persona_id = 1L;

    public Header() {
    }

    public Header(Long id, String url_logo_pagina, String titulo_pagina) {
        this.id = id;
        this.url_logo_pagina = url_logo_pagina;
        this.titulo_pagina = titulo_pagina;
    }
}
