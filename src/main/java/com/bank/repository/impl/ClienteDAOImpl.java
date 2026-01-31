package com.bank.repository.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    List<Cliente> dataBase = new ArrayList<>();

    @Override
    public boolean create(Cliente cliente) {
        return dataBase.add(cliente);
    }

    @Override
    public Cliente read(String cpf) {
        for(Cliente c : dataBase) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    //TODO
    @Override
    public boolean update(String cpf, Cliente cliente) {
        return false;
    }

    //TODO
    @Override
    public boolean delete(String cpf) {
        return false;
    }

    @Override
    public List<Cliente> getAll() {
        return this.dataBase;
    }
}
