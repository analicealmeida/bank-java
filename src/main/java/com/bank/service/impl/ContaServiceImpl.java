package com.bank.service.impl;

import com.bank.exception.ClienteNaoEncontradoException;
import com.bank.model.Conta;
import com.bank.repository.ContasDAO;
import com.bank.repository.impl.ContasDAOImpl;
import com.bank.service.ClienteService;
import com.bank.service.ContaService;

import java.util.List;

public class ContaServiceImpl implements ContaService {

    private ContasDAO contaDAO;
    public ContaServiceImpl (){
        this.contaDAO = new ContasDAOImpl();
    }

    private ClienteService clienteDados = new ClienteServiceImpl();


    @Override
    public boolean create(Conta conta) {
        if (clienteDados.read(conta.getCpfTitular()) == null )  {
            throw new ClienteNaoEncontradoException("Cpf de cliente não encontrado.");

        }
        return contaDAO.create(conta);
    }

    @Override
    public Conta read(String numeroConta) {
        return contaDAO.read(numeroConta);
    }

    @Override
    public boolean update(String numeroConta, Conta conta) {
        return contaDAO.update(numeroConta, conta);
    }

    @Override
    public boolean delete(String numeroConta) {
        return contaDAO.delete(numeroConta);
    }

    @Override
    public List<Conta> getAll() {
        return contaDAO.getAll();
    }
}

