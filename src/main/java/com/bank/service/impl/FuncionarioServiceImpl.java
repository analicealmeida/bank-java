package com.bank.service.impl;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.repository.ClienteDAO;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.repository.impl.FuncionarioDAOImpl;
import com.bank.service.FuncionarioService;

import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService{

    private FuncionarioDAO dao1;

    public FuncionarioServiceImpl() {
        dao1 = new FuncionarioDAOImpl();
    }

    @Override
    public boolean create(Funcionario funcionario) {
        String cpf = funcionario.getCpf();
        if (cpf != null && cpf.length() == 11 && this.read(cpf) == null) {
            return dao1.create(funcionario);
        }
        return false;
    }


@Override
public Funcionario read(String cpf) {
    return dao1.read(cpf);
}

@Override
public boolean update(String cpf, Funcionario funcionario) {
    return dao1.update(cpf, funcionario);

}

@Override
public boolean delete(String cpf) {
    if (cpf == null || cpf.length() != 11) {
        return false;
    }
    return dao1.delete(cpf);

}

@Override
public List<Funcionario> getAll() {
    return dao1.getAll();}



@Override
public List<Funcionario> numeroCargoIntern() {
    return dao1.numeroCargoIntern();

}
}
