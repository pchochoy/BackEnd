
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Proyecto;
import java.util.List;
import java.util.Optional;


public interface IProyectoService {
    
    public List<Proyecto> buscarProyectos();
    
    public Optional<Proyecto> buscarProyectoById(Integer id);
    
    public void grabarProyecto(Proyecto proyecto);
    
    public void borrarProyecto(Integer id);
    
    public void actualizarProyecto(Proyecto proyecto);
    
}
