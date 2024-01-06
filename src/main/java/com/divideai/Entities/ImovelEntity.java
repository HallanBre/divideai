package com.divideai.Entities;

import jakarta.persistence.*;

@Entity
public class ImovelEntity {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String endereco;
    private float valor;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private ImobiliariaEntity imobiliariaEntity;


    public ImovelEntity(int id, String endereco, float valor,ImobiliariaEntity imobiliariaEntity) {
        this.id = id;
        this.endereco = endereco;
        this.valor = valor;
        this.imobiliariaEntity = imobiliariaEntity;
    }

    public ImovelEntity(){

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

    public ImobiliariaEntity getImobiliariaEntity() {
        return imobiliariaEntity;
    }

    public void setImobiliariaEntity(ImobiliariaEntity imobiliariaEntity) {
        this.imobiliariaEntity = imobiliariaEntity;
    }
}
