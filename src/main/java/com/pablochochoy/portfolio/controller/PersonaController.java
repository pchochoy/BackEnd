
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.Persona;
import com.pablochochoy.portfolio.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins="http://localhost:4200/")
@CrossOrigin(origins="https://pdchportfolio.web.app/")
public class PersonaController {
    
    @Autowired
    private IPersonaService perServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear/persona")
    public void agregarPersona(@RequestBody Persona per) {
        System.out.println("Estoy en crear Persona");
        perServ.grabarPersona(per);
    }
    
    @GetMapping("/buscar/personaxid/{id}")
    public Persona buscarPersona(@PathVariable Long id) {
        System.out.println("Estoy en buscarPersona con id " + id);
        return perServ.buscarPersona(id);
    }
    
    @DeleteMapping ("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        perServ.borrarPersona(id);
    }
    
    @PostMapping("/actualizar/persona")
    public void actualizarPersona(@RequestBody Persona per) {
        System.out.println("Estoy en actualizarPersona con datos " + per.getNomapel());
        perServ.actualizarPersona(per);
    }
}
