
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.Estudio;
import com.pablochochoy.portfolio.service.IEstudioService;
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
@CrossOrigin(origins="https://pdchportfolio.web.app/porfolio/")
public class EstudioController {
    
    @Autowired
    private IEstudioService estServ;
    
    @PostMapping("/crear/estudio")
    public void agregarEstudio(@RequestBody Estudio est) {
        estServ.grabarEstudio(est);
    }
    
    @GetMapping("/buscar/estudios")
    @ResponseBody
    public List<Estudio> buscarEstudios() {
        return estServ.buscarEstudios();
    }
    
    @GetMapping("/buscar/estudioxid/{id}")
    public Optional<Estudio> getById(@PathVariable("id") Long id){
        return estServ.buscarEstudioById(id);
        //return new ResponseEntity(experiencia, HttpStatus.OK);
        //return experiencia;
    }
    
    @DeleteMapping ("/borrar/estudio/{id}")
    public void borrarEstudio(@PathVariable Long id) {
        estServ.borrarEstudio(id);
    }
    
    @PostMapping("/actualizar/estudio")
    public void actualizarEstudio(@RequestBody Estudio est) {
        estServ.actualizarEstudio(est);
    }
}
