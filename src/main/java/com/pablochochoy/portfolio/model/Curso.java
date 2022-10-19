
package com.pablochochoy.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String instituto;
    private int anio;
    private String titulo;
    private String logo;

    public Curso() {
    }

    public Curso(Long id, String instituto, int anio, String titulo, String logo) {
        this.id = id;
        this.instituto = instituto;
        this.anio = anio;
        this.titulo = titulo;
        this.logo = logo;
    }
}
