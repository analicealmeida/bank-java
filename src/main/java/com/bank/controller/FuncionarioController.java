package com.bank.controller;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.service.ClienteService;
import com.bank.service.FuncionarioService;
import com.bank.service.impl.ClienteServiceImpl;
import com.bank.service.impl.FuncionarioServiceImpl;

import java.util.List;

public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController(){
        this.funcionarioService = new FuncionarioServiceImpl();
    }

    public boolean create(Funcionario funcionario){
        return this.funcionarioService.create(funcionario);
    }
    public Funcionario read(String cpf){
        return this.funcionarioService.read(cpf);
    }
    public boolean update(String cpf, Funcionario funcionario){
        return this.funcionarioService.update(cpf, funcionario);
    }
    public boolean delete(String cpf){
        return this.funcionarioService.delete(cpf);
    }

    public List<Funcionario> getAll(){
        return this.funcionarioService.getAll();
    }
}
}
