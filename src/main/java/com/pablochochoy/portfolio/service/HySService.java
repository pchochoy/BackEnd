
package com.pablochochoy.portfolio.service;

import com.pablochochoy.portfolio.model.HyS;
import com.pablochochoy.portfolio.repository.HySRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class HySService implements IHySService{
    
    @Autowired
    public HySRepository hysRepo;

    @Override
    public List<HyS> buscarHySs() {
        return hysRepo.findAll();
    }

    @Override
    public Optional<HyS> buscarHySById(Integer id) {
        return hysRepo.findById(id);
    }

    @Override
    public void grabarHyS(HyS hys) {
        hysRepo.save(hys);
    }

    @Override
    public void borrarHyS(Integer id) {
        hysRepo.deleteById(id);
    }

    @Override
    public void actualizarHyS(HyS hys) {
        hysRepo.save(hys);
    }
}
