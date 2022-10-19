
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Proyecto;
import com.pablochochoy.portfolio.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyRepo;

    @Override
    public List<Proyecto> buscarProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public Optional<Proyecto> buscarProyectoById(Integer id) {
        return proyRepo.findById(id);
    }

    @Override
    public void grabarProyecto(Proyecto proyecto) {
        proyRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proyRepo.deleteById(id);
    }

    @Override
    public void actualizarProyecto(Proyecto proyecto) {
        proyRepo.save(proyecto);
    }
}
