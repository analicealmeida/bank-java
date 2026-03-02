package com.bank.service.impl;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO dao;

    public ClienteServiceImpl(){
        dao = new ClienteDAOImpl();
    }

    @Override
    public boolean create(Cliente cliente) {
        String cpf = cliente.getCpf();
        if(cpf == null){
            throw new IllegalArgumentException("Cpf não pode ser nulo.");
        } if (cpf.length() != 11){
            throw new IllegalArgumentException("CPF invalido.");
        } if (this.read(cpf) != null){
            throw new IllegalStateException("Cliente ja cadastrado.");
        }
        return dao.create(cliente);
    }

    @Override
    public Cliente read(String cpf) {
        return dao.read(cpf);
    }

    @Override
    public boolean update(String cpf, Cliente cliente) {
        if(cpf ==null || cpf.length() != 11 || cliente == null || cliente.getCpf() == null){
            throw new IllegalArgumentException("CPF invalido.");
        }
        return dao.update(cpf, cliente);
    }

    @Override
    public boolean delete(String cpf) {
        if(cpf == null || cpf.length() != 11){
            throw new IllegalArgumentException("CPF inválido.");
        }
        return dao.delete(cpf);
    }

    @Override
    public List<Cliente> scoreMaiorQue500() {
        List<Cliente> clientes = getAll();
        List<Cliente> clientesResultado = new ArrayList<>();
        for (Cliente cliente : clientes){
            if (cliente.getScore() > 500){
                clientesResultado.add(cliente);
            }
        }
        return clientesResultado;
    }

    @Override
    public List<Cliente> getAll() {
        return dao.getAll();
    }
}



