package com.bank.service;

import com.bank.model.Cliente;
import com.bank.model.Conta;

import java.util.List;

public interface ContaService {
    boolean create(Conta conta);
    Conta read(String numeroConta);
    boolean update(String numeroConta, Conta conta);
    boolean delete(String numeroConta);
    List<Conta> getAll();
}
