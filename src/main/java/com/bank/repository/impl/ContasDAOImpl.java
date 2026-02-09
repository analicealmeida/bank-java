package com.bank.repository.impl;

import com.bank.model.Conta;
import com.bank.repository.ContasDAO;

import java.util.HashMap;
import java.util.Map;

public class ContasDAOImpl implements ContasDAO {

    private Map<String, Conta> contas = new HashMap<>();


    @Override
    public boolean create(Conta conta) {
        //crud de hashmap não precisa de for para fazer uma varredura em busca de dados, o acesso é direto na chave
        contas.put(conta.getNumeroConta(), conta);
        return true;

    }

    @Override
    public Conta read(String numeroConta) {
        return contas.get(numeroConta);
    }

    @Override
    public boolean update(String numeroConta, Conta conta) {
        if (contas.containsKey(numeroConta)) {
            contas.put(numeroConta, conta);
            return true;
        }
        return false;
    }
    @Override
    public boolean delete(String numeroConta) {
        if(contas.containsKey(numeroConta)) {
            contas.remove(numeroConta);
            return true;
        }
        return false;
    }
}
