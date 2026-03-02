package com.bank.repository;

import com.bank.model.Cliente;
import com.bank.model.Conta;

import java.util.ArrayList;
import java.util.List;

public interface ContasDAO extends GenericDAO<Conta, String> {

    List<Conta> getAll();

}
