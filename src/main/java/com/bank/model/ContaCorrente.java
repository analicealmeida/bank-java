package com.bank.model;

public class ContaCorrente extends Conta {
    //declaraçao
    private double chequeEspecial;
    //construtor
   public ContaCorrente(){
       super();

   }
    //encapsulamento
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    //ação

}
