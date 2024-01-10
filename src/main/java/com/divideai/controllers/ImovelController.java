package com.divideai.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/imovel")
public class ImovelController {

//    @Autowired
//    ImovelService service;
//
//    @GetMapping("/lista")
//    public List<ImovelDto> getObject(){
//        return service.listaImovel();
//    }
//
//    @PostMapping("/cadastro")
//    public void cadastro(Immobile imovel){
//        service.salvarImovel(imovel);
//    }
//
//    @GetMapping("/busca/{id}")
//    public ImovelDto getObjectId(@PathVariable("id") int id){
//        return service.buscaImovel(id);
//    }
//    @GetMapping("/excluir/{id}")
//    public String DeleteId(@PathVariable("id") int id){
//        return service.excluirImovel(id);
//    }
}
