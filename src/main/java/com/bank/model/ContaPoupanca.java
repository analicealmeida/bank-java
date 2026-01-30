package com.bank.model;

public class ContaPoupanca extends Conta {
    //declaração
    private double rendimento;
    //construtor
    public ContaPoupanca(){

    }
    //encapsulamento
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    //ação

}
