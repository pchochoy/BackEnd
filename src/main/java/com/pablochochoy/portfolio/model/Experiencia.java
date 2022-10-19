
package com.pablochochoy.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String periodo;
    private String tarea;
    private String logo;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String periodo, String tarea, String logo) {
        this.id = id;
        this.empresa = empresa;
        this.periodo = periodo;
        this.tarea = tarea;
        this.logo = logo;
    }
}
