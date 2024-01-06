package com.divideai.services;

import com.divideai.Entities.UsuarioEntity;
import com.divideai.Repository.UsuarioRepository;
import com.divideai.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public String cadastroUsuario(UsuarioEntity usuario){
        usuarioRepository.save(usuario);
        return "";
    }
    public String excluirUsuario(int id){
        usuarioRepository.deleteById(id);
        return "";
    }
    public UsuarioDto buscaUsuario(int id){
        UsuarioEntity usuario = usuarioRepository.findById(id).get();
        UsuarioDto dto = new UsuarioDto(usuario);
        return dto;
    }

    public List<UsuarioDto> listaUsuario(){
        List<UsuarioEntity> usuario = usuarioRepository.findAll();
        return usuario.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
    }



}
