package com.divideai.services.proxy;

import com.divideai.Entities.RealState;
import com.divideai.services.RealStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealStateServiceProxy implements RealStateService {

    @Autowired
    private RealStateService realStateService;

    @Override
    public RealState save(RealState realState){
        return realStateService.save(realState);
    }

    @Override
    public RealState deleteBy(Integer id){ return realStateService.deleteBy(id);}

    @Override
    public RealState findBy(Integer id) {return realStateService.findBy(id);}
}

