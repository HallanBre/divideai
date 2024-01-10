package com.divideai.services.proxy;

import com.divideai.Entities.Property;
import com.divideai.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceProxy implements PropertyService {

    @Autowired
    private PropertyService propertyService;

    @Override
    public Property save(Property property){
        return propertyService.save(property);
    }

    @Override
    public Property deleteBy(Integer id) { return propertyService.deleteBy(id);}

    @Override
    public Property findBy(Integer id) { return propertyService.findBy(id);}
}
