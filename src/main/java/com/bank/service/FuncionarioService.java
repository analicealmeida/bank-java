package com.bank.service;

import com.bank.model.Cliente;
import com.bank.model.Conta;
import com.bank.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    boolean create(Funcionario funcionario);
    Funcionario read(String cpf);
    boolean update(String cpf, Funcionario funcionario);
    boolean delete(String cpf);
    List<Funcionario> getAll();

}
