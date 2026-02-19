package com.bank.controller;

import com.bank.model.Cliente;
import com.bank.model.Conta;
import com.bank.service.ClienteService;
import com.bank.service.ContaService;
import com.bank.service.impl.ClienteServiceImpl;
import com.bank.service.impl.ContaServiceImpl;

public class ContaController {

    private ContaService service;

    public ContaController(){
        this.service = new ContaServiceImpl();
    }

    public boolean create(Conta conta){
        return this.service.create(conta);
    }
    public Conta read(String cpf){
        return this.service.read(cpf);
    }
    public boolean update(String cpf, Conta conta){
        return this.service.update(cpf, conta);
    }
    public boolean delete(String cpf){
        return this.service.delete(cpf);
    }

}
