
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Experiencia;
import com.pablochochoy.portfolio.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> buscarExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void grabarExperiencia(Experiencia exp) {
        expRepo.save(exp);        
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);        
    }

    @Override
    public void actualizarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public Optional<Experiencia> buscarExperienciaById(Long id) {
        System.out.println("Estoy en buscarExperienciaById() de ExperienciaSerice " + id);
        return expRepo.findById(id);
    }
}
