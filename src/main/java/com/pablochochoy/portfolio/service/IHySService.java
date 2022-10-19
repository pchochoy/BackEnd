
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.HyS;
import java.util.List;
import java.util.Optional;


public interface IHySService {
    
    public List<HyS> buscarHySs();
    
    public Optional<HyS> buscarHySById(Integer id);
    
    public void grabarHyS(HyS hys);
    
    public void borrarHyS(Integer id);
    
    public void actualizarHyS(HyS hys);
}
