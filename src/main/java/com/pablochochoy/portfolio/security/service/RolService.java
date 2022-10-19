
package com.pablochochoy.portfolio.security.service;

import com.pablochochoy.portfolio.security.entity.Rol;
import com.pablochochoy.portfolio.security.enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pablochochoy.portfolio.security.repository.IRolRepository;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository irolrepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre)
    {
        System.out.println("Estoy dentro degetByRolNombre() " + irolrepository.findByRolNombre(rolNombre));
        return irolrepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        irolrepository.save(rol);
    }
    
}
