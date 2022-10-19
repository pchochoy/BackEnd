
package com.pablochochoy.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String nombre;
    private int anio;
    private String descripcion;
    private String link;

    public Proyecto() {
    }

    public Proyecto(String nombre, int anio, String descripcion, String link) {
        this.nombre = nombre;
        this.anio = anio;
        this.descripcion = descripcion;
        this.link = link;
    }    
}
