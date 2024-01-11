package com.divideai.controllers;

import com.divideai.Entities.RealState;
import com.divideai.services.RealStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.security.PublicKey;

@RestController
@RequestMapping("/realState")
public class RealStateController {

    @Autowired
    @Qualifier("realStateServiceProxy")
    private RealStateService realStateService;

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody RealState realState) {
        RealState savedRealState = realStateService.save(realState);
        return ResponseEntity.created(URI.create("/realState/id/" + savedRealState.getId())).build();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> findBy(@PathVariable("id") Integer id){
        RealState findedRealState = realStateService.findBy(id);
        return ResponseEntity.ok(findedRealState);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> deleteBy(@PathVariable("id") Integer id) {
        RealState deletedRealState = realStateService.deleteBy(id);
        return ResponseEntity.ok(deletedRealState);
    }
}
