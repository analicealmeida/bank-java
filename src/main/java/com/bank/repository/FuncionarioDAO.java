package com.bank.repository;

import com.bank.model.Funcionario;

public interface FuncionarioDAO {

    public boolean create (Funcionario funcionario);
    public Funcionario read (String cpf);
    public boolean update (String cpf, Funcionario funcionario);
    public boolean delete (String cpf);




}
