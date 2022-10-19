
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.Persona;

public interface IPersonaService {
    
    public Persona buscarPersona(Long id);
    
    public void grabarPersona(Persona perso);
    
    public void borrarPersona(Long id);
    
    public void actualizarPersona(Persona perso);
    
}
