package com.divideai.controllers;

import com.divideai.Entities.UsuarioEntity;
import com.divideai.dto.UsuarioDto;
import com.divideai.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @GetMapping("/lista")
    public List<UsuarioDto> getObject(){
        return service.listaUsuario();
    }
    @PostMapping("/cadastro")
    public void cadastro(UsuarioEntity usuario){
        service.cadastroUsuario(usuario);
    }
    @GetMapping("/busca/{id}")
    public UsuarioDto getObjectId(@PathVariable("id") int id){
        return service.buscaUsuario(id);
    }
    @GetMapping("/excluir/{id}")
    public String DeleteId(@PathVariable("id") int id){
        return service.excluirUsuario(id);
    }
}
