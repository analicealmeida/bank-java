package com.bank.model;

import java.util.Date;

public abstract class Pessoa {

    //declaração
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;

    //construtores
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Pessoa (){
     }
    //set e get
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}

//métodos = ação
