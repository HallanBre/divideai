package com.divideai.services;

import com.divideai.Entities.ImovelEntity;
import com.divideai.Repository.ImovelRepository;
import com.divideai.dto.ImovelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImovelService {

    @Autowired
    ImovelRepository imovelRepository;

    public String salvarImovel(ImovelEntity imovel){
        imovelRepository.save(imovel);
        return "";
    }
    public String excluirImovel(int id){
        imovelRepository.deleteById(id);
        return "";
    }
    public ImovelDto buscaImovel(int id){
        ImovelEntity imovel = imovelRepository.findById(id).get();
        ImovelDto dto = new ImovelDto(imovel);
        return dto;
    }
    public List<ImovelDto> listaImovel(){
        List<ImovelEntity> imovel = imovelRepository.findAll();
        return imovel.stream().map(x -> new ImovelDto(x)).collect(Collectors.toList());
    }
}
