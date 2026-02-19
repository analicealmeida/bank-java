package com.bank.service.impl;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.repository.ClienteDAO;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.repository.impl.FuncionarioDAOImpl;
import com.bank.service.FuncionarioService;

import java.util.List;

public class FuncionarioServiceImpl {

    private FuncionarioDAO dao1;

    public FuncionarioServiceImpl() {
        dao1 = new FuncionarioDAOImpl();
    }

    @Override
    boolean create(Funcionario funcionario) {
        String cpf = funcionario.getCpf();
        if (cpf != null && cpf.length() == 11 && this.read(cpf) == null) {
            return dao1.create(funcionario);
        }
        return false;
    }
}

@Override
Funcionario read(String cpf) {
    String cpf = dao1.getCpf();
    if (cpf != null && cpf.length() == 11 && this.read(cpf) == null) {
        return dao1.create(funcionario);
    }
    return false;

}

@Override
boolean update(String cpf, Funcionario funcionario) {
    return dao1.read(cpf);

}

@Override
boolean delete(String cpf) {
    if (cpf == null || cpf.length() != 11) {
        return false;
    }
    return dao1.delete(cpf);

}

@Override
List<Funcionario> getAll() {
    return dao1.getAll();
}
}

@Override
public List<Funcionario> numeroCargoIntern() {
    return dao1.numeroCargoIntern();


}
