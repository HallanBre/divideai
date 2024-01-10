package com.divideai.controllers;


import com.divideai.Entities.Property;
import com.divideai.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    @Qualifier("propertyServiceProxy")
    private PropertyService propertyService;

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody Property property){
        Property saverProperty = propertyService.save(property);
        return ResponseEntity.created(URI.create("/property/id/" + saverProperty.getId())).build();
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<?> findBy(@PathVariable("id") Integer id) {
        Property findedProperty = propertyService.findBy(id);
        return ResponseEntity.ok(findedProperty);
    }
    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> deleteBy(@PathVariable("id") Integer id) {
        Property deletedProperty = propertyService.deleteBy(id);
        return ResponseEntity.ok(deletedProperty);
    }
}
