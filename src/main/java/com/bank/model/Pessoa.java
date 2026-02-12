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

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    //set e get
    public String getNome() {
        return nome;
    }

    public String getEmail(String dadosCliente) {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
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

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    //métodos = ação
    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Email:  " + email +
                " | CPF: " + cpf +
                " | Data Nascimento:" + dataNascimento;
    }
}

