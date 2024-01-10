package com.divideai.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/imobiliaria")
public class ImobiliariaController {
	
//    @Autowired
//    ImobiliariaService service;
//
//    @GetMapping("/lista")
//    public List<ImobiliariaDto> getObject(){
//        return service.listaImobiliaria();
//    }
//
//    @PostMapping("/cadastro")
//    @Transactional
//    public ResponseEntity<?> cadastro(@Valid ImobiliariaEntity imobiliaria){
//       ImobiliariaEntity imobiliariaSalva =  service.salvarImobiliaria(imobiliaria);
//       return ResponseEntity.created(URI.create("/imobiliaria/id/" + imobiliariaSalva.getId())).build();
//    }
//
//    @GetMapping("/busca/{id}")
//    public ImobiliariaDto getObjectId(@PathVariable("id") int id){
//        return service.buscaImobiliaria(id);
//    }
//
//    @GetMapping("/excluir/{id}")
//    public void DeleteId(@PathVariable("id") int id){
//        ImobiliariaEntity imobiliariaDeletada = service.excluirImobiliaria(id);
//        return ResponseEntity.ok(converter.toJsonMap(enterpriseDeleted));
//    }
}
