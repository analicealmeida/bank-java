package com.bank.service;

import com.bank.model.Cliente;
import com.bank.model.Conta;

import java.util.List;

public interface ContaService {
    boolean create(Conta conta);
    Conta read(String cpf);
    boolean update(String cpf, Conta conta);
    boolean delete(String cpf);
    List<Conta> getAll();
}
