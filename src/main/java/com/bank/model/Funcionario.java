package com.bank.model;

import com.bank.study.estruturadedados.Produtos;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    //declaração

    private double salario;
    public Cargo cargo;
    

    //construtor default
    public Funcionario() {

    }
    public Funcionario(String cpf, String nome, String email){
        super(cpf,nome,email);
    }

    //set e get
    public double getSalario() {
        return salario;
    }

    public Cargo cargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    //metodo = ação
    //public double calcularSalarioAnual() {
        //return this.salario * 12;
    //}




 }