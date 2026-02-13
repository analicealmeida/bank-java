package com.bank.service;

import com.bank.model.Cliente;

import java.util.List;

public interface ClienteService {

    boolean create(Cliente cliente);
    Cliente read(String cpf);
    boolean update(String cpf, Cliente cliente);
    boolean delete(String cpf);
    List<Cliente> getAll();
}
