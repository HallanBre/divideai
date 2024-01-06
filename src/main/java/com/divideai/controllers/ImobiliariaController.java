package com.divideai.controllers;

import com.divideai.Entities.ImobiliariaEntity;
import com.divideai.dto.ImobiliariaDto;
import com.divideai.services.ImobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/imobiliaria")
public class ImobiliariaController {
    @Autowired
    ImobiliariaService service;

    @GetMapping("/lista")
    public List<ImobiliariaDto> getObject(){
        return service.listaImobiliaria();
    }

    @PostMapping("/cadastro")
    public void cadastro(ImobiliariaEntity imobiliaria){
        service.salvarImobiliaria(imobiliaria);
    }
    @GetMapping("/busca/{id}")
    public ImobiliariaDto getObjectId(@PathVariable("id") int id){
        return service.buscaImobiliaria(id);
    }
    @GetMapping("/excluir/{id}")
    public String DeleteId(@PathVariable("id") int id){
        return service.excluirImobiliaria(id);
    }
}
