package com.divideai.controllers;

import com.divideai.Entities.ImovelEntity;
import com.divideai.dto.ImovelDto;
import com.divideai.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/imovel")
public class ImovelController {

    @Autowired
    ImovelService service;

    @GetMapping("/lista")
    public List<ImovelDto> getObject(){
        return service.listaImovel();
    }

    @PostMapping("/cadastro")
    public void cadastro(ImovelEntity imovel){
        service.salvarImovel(imovel);
    }

    @GetMapping("/busca/{id}")
    public ImovelDto getObjectId(@PathVariable("id") int id){
        return service.buscaImovel(id);
    }
    @GetMapping("/excluir/{id}")
    public String DeleteId(@PathVariable("id") int id){
        return service.excluirImovel(id);
    }
}
