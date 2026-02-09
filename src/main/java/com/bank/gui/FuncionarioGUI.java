package com.bank.gui;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.FuncionarioDAOImpl;

public class FuncionarioGUI { //ESTUDAR
    public static void main(String[] args) {
        FuncionarioDAO dao = new FuncionarioDAOImpl();

        Funcionario func = new Funcionario("123","Joao", "joao@yahoo.com");
        Funcionario func1 = new Funcionario("456", "Maria", "maria@gmail.com");
        Funcionario func2 = new Funcionario("789", "Igor", "igor@gmail.com");

        dao.create(func);
        dao.create(func1);
        dao.create(func2);

        Funcionario read = dao.read("123");

        System.out.println(read.getNome());

        dao.delete("789");

        dao.update(func.getCpf(), new Funcionario("987", "Gabriela", "gabriela@gmail.com"));

        System.out.println(dao.read("987").getNome());




    }
}
