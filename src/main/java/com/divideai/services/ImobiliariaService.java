package com.divideai.services;

import com.divideai.Entities.ImobiliariaEntity;
import com.divideai.Repository.ImobiliariaRepository;
import com.divideai.dto.ImobiliariaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImobiliariaService {
    @Autowired
    ImobiliariaRepository imobiliariaRepository;

    public String salvarImobiliaria(ImobiliariaEntity imobiliaria){
        imobiliariaRepository.save(imobiliaria);
        return "";
    }
    public String excluirImobiliaria(int id) {
        imobiliariaRepository.deleteById(id);
        return "";
    }
    public ImobiliariaDto buscaImobiliaria(int id){
        ImobiliariaEntity imobiliaria = imobiliariaRepository.findById(id).get();
        ImobiliariaDto dto = new ImobiliariaDto(imobiliaria);
        return dto;
    }

    public List<ImobiliariaDto> listaImobiliaria() {
        List<ImobiliariaEntity> imobiliaria = imobiliariaRepository.findAll();
        return imobiliaria.stream().map(x -> new ImobiliariaDto(x)).collect(Collectors.toList());
    }
}
