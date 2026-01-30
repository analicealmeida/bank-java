package com.bank.model;

import com.bank.study.estruturadedados.Produtos;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    //declaração

    private double salario;
    public String cargo;
    

    //construtor default
    public Funcionario() {

    }

    //set e get
    public double getSalario() {
        return salario;
    }

    public String cargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //metodo = ação
    public double calcularSalarioAnual() {
        return this.salario * 12;
    }




 }