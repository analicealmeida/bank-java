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


    //encapsulamento: get e set
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //ação

}

