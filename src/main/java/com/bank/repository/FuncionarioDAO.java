package com.bank.repository;

import com.bank.model.Funcionario;

import java.util.List;

public interface FuncionarioDAO extends GenericDAO<Funcionario, String> {

    public List<Funcionario> getAll();

    List<Funcionario> numeroCargoIntern();
}
