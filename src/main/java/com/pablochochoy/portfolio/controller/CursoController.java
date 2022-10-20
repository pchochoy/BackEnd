
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.Curso;
import com.pablochochoy.portfolio.service.ICursoService;
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
public class CursoController {
    
    @Autowired
    private ICursoService curServ;
    
    @PostMapping("/crear/curso")
    public void agregarCurso(@RequestBody Curso cur) {
        curServ.grabarCurso(cur);
    }
    
    @GetMapping("/buscar/cursos")
    @ResponseBody
    public List<Curso> buscarCursos() {
        System.out.println("Estoy en bucarCursos() del controller");
        return curServ.buscarCursos();
    }
    
    @GetMapping("/buscar/cursoxid/{id}")
    public Optional<Curso> getById(@PathVariable("id") Long id){
        return curServ.buscarCursoById(id);
        //return new ResponseEntity(experiencia, HttpStatus.OK);
        //return experiencia;
    }
    
    @DeleteMapping ("/borrar/curso/{id}")
    public void borrarCurso(@PathVariable Long id) {
        curServ.borrarCurso(id);
    }
    
    @PostMapping("/actualizar/curso")
    public void actualizarCurso(@RequestBody Curso cur) {
        curServ.actualizarCurso(cur);
    }
}
