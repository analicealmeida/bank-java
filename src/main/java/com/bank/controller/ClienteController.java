package com.bank.controller;

import com.bank.model.Cliente;
import com.bank.service.ClienteService;
import com.bank.service.impl.ClienteServiceImpl;

import java.util.List;

public class ClienteController {

    private ClienteService service;

    public ClienteController(){
        this.service = new ClienteServiceImpl();
    }

    public List<Cliente> scoreMaiorQue500(){
       return service.scoreMaiorQue500();


    }













    public boolean create(Cliente cliente){
        return this.service.create(cliente);
    }
    public Cliente read(String cpf){
        return this.service.read(cpf);
    }
    public boolean update(String cpf, Cliente cliente){
        return this.service.update(cpf, cliente);
    }
    public boolean delete(String cpf){
        return this.service.delete(cpf);
    }

    public List<Cliente> getAll(){
        return this.service.getAll();
    }


}
