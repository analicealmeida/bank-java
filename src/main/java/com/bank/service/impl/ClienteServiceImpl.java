package com.bank.service.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.service.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO dao;

    public ClienteServiceImpl(){
        dao = new ClienteDAOImpl();
    }

    @Override
    public boolean create(Cliente cliente) {
        String cpf = cliente.getCpf();
        if(cpf != null && cpf.length() == 11 && this.read(cpf) == null){
            return dao.create(cliente);
        }
        return false;
    }

    @Override
    public Cliente read(String cpf) {
        return dao.read(cpf);
    }

    @Override
    public boolean update(String cpf, Cliente cliente) {
        if(cpf ==null || cpf.length() != 11 || cliente == null || cliente.getCpf() == null){
            return false;
        }
        return dao.update(cpf, cliente);
    }

    @Override
    public boolean delete(String cpf) {
        if(cpf == null || cpf.length() != 11){
            return false;
        }
        return dao.delete(cpf);
    }

    @Override
    public List<Cliente> scoreMaiorQue500() {
        return dao.scoreMaiorQue500();
    }

    @Override
    public List<Cliente> getAll() {
        return dao.getAll();
    }
}



