package com.bank.repository;

import com.bank.model.Conta;

public interface ContasDAO {

    public boolean create(Conta conta);
    public Conta read (String numeroConta);
    public boolean update (String numeroConta, Conta conta);
    public boolean delete (String numeroConta);
}
