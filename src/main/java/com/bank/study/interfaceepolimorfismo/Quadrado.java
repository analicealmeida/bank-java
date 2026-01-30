package com.bank.study.interfaceepolimorfismo;

public class Quadrado implements CalcularArea{
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
    public Quadrado (double lado){
        this.lado = lado;
    }

}
