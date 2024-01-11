package com.divideai.services.impl;

import com.divideai.Entities.Property;
import com.divideai.Repository.PropertyRepository;
import com.divideai.services.PropertyService;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository repository;

    @Override
    public Property save(Property property) {
        Preconditions.checkNotNull(property, "The user is required to save. ");
        return repository.save(property);
    }

    @Override
    public Property deleteBy(Integer id) {
        Preconditions.checkNotNull(id, "The id is required to delete user. ");
        return repository.deleteBy(id);
    }

    @Override
    public Property findBy(Integer id) {
        Preconditions.checkNotNull(id, "The id is required to find user. ");
        return repository.findBy(id);
    }
}
