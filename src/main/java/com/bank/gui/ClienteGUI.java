package com.bank.gui;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;

public class ClienteGUI {

    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAOImpl();

        dao.create(new Cliente("Antonio","emial"));
        dao.create(new Cliente("Analice","emial"));
        dao.getAll().forEach(cliente->{
            System.out.println(cliente.getNome());
        });
    }
}
