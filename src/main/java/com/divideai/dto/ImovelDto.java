package com.divideai.dto;

import com.divideai.Entities.ImovelEntity;

public class ImovelDto {

    private int id;
    private String endereco;
    private float valor;

    public ImovelDto(ImovelEntity imovel) {
        this.id = imovel.getId();
        this.endereco = imovel.getEndereco();
        this.valor = imovel.getValor();
    }

    public ImovelDto(){

    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
