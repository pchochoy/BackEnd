
package com.pablochochoy.portfolio.repository;

import com.pablochochoy.portfolio.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
