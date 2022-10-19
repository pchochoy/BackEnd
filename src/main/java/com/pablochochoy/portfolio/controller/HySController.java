
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.HyS;
import com.pablochochoy.portfolio.service.IHySService;
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
@CrossOrigin(origins="http://localhost:4200/")
public class HySController {
    
    @Autowired
    private IHySService hysServ;
    
    @PostMapping("/crear/hys")
    public void agregarHys(@RequestBody HyS hys) {
        hysServ.grabarHyS(hys);
    }
    
    @GetMapping("/buscar/hyss")
    @ResponseBody
    public List<HyS> buscarHySs() {
        return hysServ.buscarHySs();
    }
    
    @GetMapping("/buscar/hysxid/{id}")
    public Optional<HyS> getById(@PathVariable("id") Integer id){
        return hysServ.buscarHySById(id);
        //return new ResponseEntity(experiencia, HttpStatus.OK);
        //return experiencia;
    }
    
    @DeleteMapping ("/borrar/hys/{id}")
    public void borrarHys(@PathVariable Integer id) {
        hysServ.borrarHyS(id);
    }
    
    @PostMapping("/actualizar/hys")
    public void actualizarHys(@RequestBody HyS hys) {
        hysServ.actualizarHyS(hys);
    }
}
