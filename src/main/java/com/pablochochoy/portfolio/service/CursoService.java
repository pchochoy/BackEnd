
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Curso;
import com.pablochochoy.portfolio.repository.CursoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    
    @Autowired
    public  CursoRepository cursoRepo;
    
    @Override
    public List<Curso> buscarCursos() {
        System.out.println("Estoy dentro de buscarCursos() del Service");
        return cursoRepo.findAll();
    }

    @Override
    public void grabarCurso(Curso cur) {
        cursoRepo.save(cur);
    }

    @Override
    public void borrarCurso(Long id) {
        cursoRepo.deleteById(id);        
    }

    @Override
    public void actualizarCurso(Curso cur) {
        cursoRepo.save(cur);
    }

    @Override
    public Optional<Curso> buscarCursoById(Long id) {
        return cursoRepo.findById(id);        
    }
}
