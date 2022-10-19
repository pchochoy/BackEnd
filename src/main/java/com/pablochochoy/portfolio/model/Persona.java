
package com.pablochochoy.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String nomapel;
    private String profesion;
    private String trabajo;
    private String info;
    private String fotoperfil;
    private String fotobanner;

    public Persona() {
    }

    public Persona(Long id, String nomapel, String profesion, String trabajo, String info, String fotoperfil, String fotobanner) {
        this.id = id;
        this.nomapel = nomapel;
        this.profesion = profesion;
        this.trabajo = trabajo;
        this.info = info;
        this.fotoperfil = fotoperfil;
        this.fotobanner = fotobanner;
    }
}
