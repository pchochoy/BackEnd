
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Curso;
import java.util.List;
import java.util.Optional;


public interface ICursoService {
    
    public List<Curso> buscarCursos();
    
    public Optional<Curso> buscarCursoById(Long id);
    
    public void grabarCurso(Curso cur);
    
    public void borrarCurso(Long id);
    
    public void actualizarCurso(Curso cur);
}
