
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Persona;
import com.pablochochoy.portfolio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository perRepo;
    
    @Override
    public Persona buscarPersona(Long id) {
        System.out.println("estoy en buscarPersona de PersonaService con id " + id);
        return perRepo.findById(id).orElse(null);
    }

    @Override
    public void grabarPersona(Persona perso) {
        System.out.println("Estoy en PersonaService-grabarPersona()");
        perRepo.save(perso);
    }

    @Override
    public void borrarPersona(Long id) {
        perRepo.deleteById(id);      
    }

    @Override
    public void actualizarPersona(Persona perso) {
        perRepo.save(perso);
    }
}
