package edu.javeriana.ingenieria.social.directivo.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Directivo {
    @Id
    private Integer id;

    @Column(name="id_institucional")
    private Integer idInstitucional;

    @Column(name="correo_institucional")
    private String correoInstitucional;

    private Integer cedula;
}
