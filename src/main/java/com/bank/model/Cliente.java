package com.bank.model;

import java.util.Scanner;

public class Cliente extends Pessoa {
    //declaração
    private int score;


    //sobrecarga de construtores, mesmo nome, parametros diferentes
    public Cliente() {
    }

    public Cliente(String nome, String email) {
        //inicializando objetos da classe pai
        super(nome, email);
    }
    public Cliente(String nome, String email, String cpf) {
        //inicializando objetos da classe pai
        super(cpf, nome, email);
    }

    public Cliente(String nome, String email, String cpf, int score) {
        //inicializando objetos da classe pai
        super(cpf, nome, email);
        this.score = score;
    }


    //encapsulamento: get e set
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //ação

}

