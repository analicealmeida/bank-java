package com.bank.repository;

import com.bank.model.Cliente;

import java.util.List;

public interface ClienteDAO {

    boolean create(Cliente cliente);
    Cliente read(String cpf);
    boolean update(String cpf, Cliente cliente);
    boolean delete(String cpf);
    List<Cliente> getAll();
}
