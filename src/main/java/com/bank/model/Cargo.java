package com.bank.model;

public enum Cargo {
    DIRETOR(50000,100000),ATENDENTE(1800,3000),GERENTE(10000,15000);
    private double salarioMaximo;
    private double salarioMinimo;

    Cargo(double salarioMinimo, double salarioMaximo){
        this.salarioMaximo = salarioMaximo;
        this.salarioMinimo = salarioMinimo;
    }



    public double getSalarioMaximo() {
        return salarioMaximo;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

}

