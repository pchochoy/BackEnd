
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Estudio;
import java.util.List;
import java.util.Optional;


public interface IEstudioService {
     public List<Estudio> buscarEstudios();
     
     public Optional<Estudio> buscarEstudioById(Long id);
    
    public void grabarEstudio(Estudio est);
    
    public void borrarEstudio(Long id);
    
    public void actualizarEstudio(Estudio est);
}
