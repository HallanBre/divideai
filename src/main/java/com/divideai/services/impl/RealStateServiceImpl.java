package com.divideai.services.impl;


import com.divideai.Entities.RealState;
import com.divideai.Repository.RealStateRepository;
import com.divideai.services.RealStateService;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealStateServiceImpl implements RealStateService {

    @Autowired
    private RealStateRepository repository;

    @Override
    public RealState save(RealState realState) {
        Preconditions.checkNotNull(realState, "The user is required to save");
        return repository.save(realState);
    }

    @Override
    public RealState deleteBy(Integer id) {
        Preconditions.checkNotNull(id, "The id is required to delete user. ");
        return repository.deleteBy(id);
    }

    @Override
    public RealState findBy(Integer id) {
        Preconditions.checkNotNull(id, "The id is required to find user. ");
        return repository.findBy(id);
    }
}
