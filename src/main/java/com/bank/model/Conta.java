package com.bank.model;

import java.math.BigDecimal;

public class Conta {
    //declaração
    private String numeroAgencia;
    private String numeroConta;
    private String cpfTitular;
    private BigDecimal saldo;

    //construtor
    //pediu construtor com parametros
    public Conta(String agencia, String numConta, String cpf, BigDecimal saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }

    public Conta() {

    }


    //encapsulamento
    public String getNumeroagencia() {
        return numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    //ação

    @Override
    public String toString() {
        return "Agência: " + numeroAgencia +
                " | Número: " + numeroConta +
                " | CPF: " + cpfTitular +
                " | Saldo: R$ " + saldo;
    }
}
