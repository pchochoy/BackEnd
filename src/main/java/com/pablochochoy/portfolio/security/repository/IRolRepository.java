
package com.pablochochoy.portfolio.security.repository;

import com.pablochochoy.portfolio.security.entity.Rol;
import com.pablochochoy.portfolio.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
