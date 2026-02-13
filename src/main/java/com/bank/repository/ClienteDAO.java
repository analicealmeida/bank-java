package com.bank.repository;

import com.bank.model.Cliente;
import com.bank.model.Conta;

import java.util.List;

public interface ClienteDAO extends GenericDAO<Cliente, String> {

    boolean validacao (String cpf);
    List<Cliente> getAll();
}
