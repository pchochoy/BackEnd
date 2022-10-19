
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Experiencia;
import java.util.List;
import java.util.Optional;


public interface IExperienciaService {
    
    public List<Experiencia> buscarExperiencias();
    
    public Optional<Experiencia> buscarExperienciaById(Long id);
    
    public void grabarExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Long id);
    
    public void actualizarExperiencia(Experiencia exp);
}
