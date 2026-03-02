package com.bank.controller;

import com.bank.model.Cliente;
import com.bank.model.Conta;
import com.bank.service.ContaService;
import com.bank.service.impl.ContaServiceImpl;

public class ContaController {

    private ContaService service;

    public ContaController(){
        this.service = new ContaServiceImpl();
    }

    public boolean create(Conta conta){
        return this.service.create(conta);
    }
    public Conta read(String numeroConta){
        return this.service.read(numeroConta);
    }
    public boolean update(String numeroConta, Conta conta){
        return this.service.update(numeroConta, conta);
    }
    public boolean delete(String numeroConta){
        return this.service.delete(numeroConta);
    }

}
