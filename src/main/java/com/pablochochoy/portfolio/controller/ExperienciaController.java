
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.Experiencia;
import com.pablochochoy.portfolio.security.controller.Mensaje;
import com.pablochochoy.portfolio.service.IExperienciaService;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@CrossOrigin(origins="https://pdchportfolio.web.app")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/crear/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        if (StringUtils.isBlank(exp.getEmpresa())) {
        }
        expServ.grabarExperiencia(exp);
    }
    
    @PostMapping("/crear/experienciaNuevo")
    public ResponseEntity<?> agregarExperienciaNuevo(@RequestBody Experiencia exp) {
        System.out.println("Estoy en /crear/experienciaNuevo de ExperienciaController");
        if (StringUtils.isBlank(exp.getEmpresa())) {
            return new ResponseEntity(new Mensaje("El nombre de la empresa es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(exp.getTarea())) {
            return new ResponseEntity(new Mensaje("La descripción de la tarea es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(exp.getPeriodo())) {
            return new ResponseEntity(new Mensaje("El período es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        expServ.grabarExperiencia(exp);
        return new ResponseEntity(new Mensaje("La experiencia se ha grabado correctamente"), HttpStatus.OK);
    }
    
    
    @GetMapping("/buscar/experiencias")
    @ResponseBody
    public List<Experiencia> buscarExperiencias() {
        System.out.println("Estoy en bucarExperiencias()");
        return expServ.buscarExperiencias();
    }
    
    /*
    @GetMapping("/buscar/experienciasxid/{id}")
    @ResponseBody
    public Experiencia buscarExperienciaById(@PathVariable Long id) {
        System.out.println("Estoy en bucarExperienciasById() " + id);
        return expServ.buscarExperienciaById(id);
    }
    */
    
    @GetMapping("/buscar/experienciasxid/{id}")
    public Optional<Experiencia> getById(@PathVariable("id") Long id){
        return expServ.buscarExperienciaById(id);
        //return new ResponseEntity(experiencia, HttpStatus.OK);
        //return experiencia;
    }
    
    @DeleteMapping ("/borrar/experiencia/{id}")
    public void borraExperiencia(@PathVariable Long id) {
        System.out.println("Estoy en ExpericiaController-borrarExperiencia");
        expServ.borrarExperiencia(id);
    }
    
    @DeleteMapping ("/borrar/experienciaNuevo/{id}")
    public ResponseEntity<?> borraExperienciaNuevo(@PathVariable Long id) {
        System.out.println("Estoy en ExpericiaController-borrarExperiencia");
        expServ.borrarExperiencia(id);
        return new ResponseEntity(new Mensaje("Se ha eliminato corrextamente la experiencia"), HttpStatus.OK);
    }
    
    @PostMapping("/actualizar/experiencia")
    public void actualizarExperiencia(@RequestBody Experiencia est) {
        expServ.actualizarExperiencia(est);
    }
}
