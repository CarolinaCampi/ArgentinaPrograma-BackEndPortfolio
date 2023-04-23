package com.argentina.programa.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity (name = "link_red_social")
public class RedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url_red_social;
    private String url_logo_red_social;
    private String alt_text_logo;
    // The value for persona_id is harcoded to the value 1 because, for now, this template will be used only for one person.
    private Long persona_id = 1L;

    public RedSocial() {
    }

    public RedSocial(Long id, String url_red_social, String url_logo_red_social, String alt_text_logo) {
        this.id = id;
        this.url_red_social = url_red_social;
        this.url_logo_red_social = url_logo_red_social;
        this.alt_text_logo = alt_text_logo;
    }
}
