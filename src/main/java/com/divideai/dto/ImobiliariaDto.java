package com.divideai.dto;

import com.divideai.Entities.ImobiliariaEntity;

public class ImobiliariaDto {

    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;

    public ImobiliariaDto(ImobiliariaEntity imobiliaria) {
        this.id = imobiliaria.getId();
        this.nome = imobiliaria.getNome();
        this.cnpj = imobiliaria.getCnpj();
        this.endereco = imobiliaria.getEndereco();
        this.contato = imobiliaria.getContato();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
