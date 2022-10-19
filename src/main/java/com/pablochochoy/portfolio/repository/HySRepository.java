
package com.pablochochoy.portfolio.repository;

import com.pablochochoy.portfolio.model.HyS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HySRepository extends JpaRepository<HyS, Integer>{
    
}
