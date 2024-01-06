package com.divideai.Entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class ImobiliariaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;

    @OneToMany(mappedBy = "imobiliaria")
    private List<ImovelEntity> imovelEntity;


    public ImobiliariaEntity(int id, String nome, String cnpj, String endereco, String contato,List<ImovelEntity> imovelEntity) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.imovelEntity = imovelEntity;
    }

    public ImobiliariaEntity(){

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

    public List<ImovelEntity> getImovelEntity() {
        return imovelEntity;
    }

    public void setImovelEntity(List<ImovelEntity> imovelEntity) {
        this.imovelEntity = imovelEntity;
    }
}
