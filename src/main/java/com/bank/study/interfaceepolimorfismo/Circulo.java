package com.bank.study.interfaceepolimorfismo;

public class Circulo implements CalcularArea {

    private double raio;
    private static final double PI = 3.14;

    @Override
    public double calcularArea() {
        return (raio*raio)*PI;
    }

    public Circulo(double raio){
        this.raio=raio;

    }

}
