package com.divideai.dto;

import com.divideai.Entities.UsuarioEntity;

import java.util.Date;
import java.util.Optional;

public class UsuarioDto {

    private int id;
    private String nome;
    private String email;
    private Date nascimento;
    private String curso;
    private String descricao;
    private String interesses;

    public UsuarioDto(UsuarioEntity usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.nascimento = usuario.getNascimento();
        this.curso = usuario.getCurso();
        this.descricao = usuario.getDescricao();
        this.interesses = usuario.getInteresses();
    }

    //GETTERS AND SETTERS
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }
}
