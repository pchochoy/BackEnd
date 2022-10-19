
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Estudio;
import com.pablochochoy.portfolio.repository.EstudioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{
    
    @Autowired
    public EstudioRepository estRepo;
    
    @Override
    public List<Estudio> buscarEstudios() {
        return estRepo.findAll();
    }

    @Override
    public void grabarEstudio(Estudio est) {
        estRepo.save(est);      
    }

    @Override
    public void borrarEstudio(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public void actualizarEstudio(Estudio est) {
        estRepo.save(est);        
    }

    @Override
    public Optional<Estudio> buscarEstudioById(Long id) {
        return estRepo.findById(id);    
    }
}
