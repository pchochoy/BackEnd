
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.Proyecto;
import com.pablochochoy.portfolio.service.IProyectoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping("/crear/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proyecto) {
        proyServ.grabarProyecto(proyecto);
    }
    
    @GetMapping("/buscar/proyectos")
    @ResponseBody
    public List<Proyecto> buscarProyectos() {
        return proyServ.buscarProyectos();
    }
    
    @GetMapping("/buscar/proyectoxid/{id}")
    public Optional<Proyecto> getById(@PathVariable("id") Integer id){
        return proyServ.buscarProyectoById(id);
        //return new ResponseEntity(experiencia, HttpStatus.OK);
        //return experiencia;
    }
    
    @DeleteMapping ("/borrar/proyecto/{id}")
    public void borrarCurso(@PathVariable Integer id) {
        proyServ.borrarProyecto(id);
    }
    
    @PostMapping("/actualizar/proyecto")
    public void actualizarCurso(@RequestBody Proyecto proyecto) {
        proyServ.actualizarProyecto(proyecto);
    }
}
