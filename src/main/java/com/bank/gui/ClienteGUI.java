package com.bank.gui;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;

import java.util.List;

public class ClienteGUI {

    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAOImpl();

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente.setNome("Joao");
        cliente.setCpf("876");
        cliente2.setNome("Joana");
        cliente2.setCpf("543");

        dao.create(cliente);
        dao.create(cliente2);

        /*
        Cliente clienteRetornado = dao.read("543");
        System.out.println(dao.read("543").getNome());
        System.out.println(clienteRetornado.getNome());
        **/

        /*List<Cliente> clientes = dao.getAll();
        for(Cliente c : clientes){
            System.out.println(c);
        }
        **/



        ClienteDAO clientesDAO2 = new ClienteDAOImpl();
        List<Cliente> clientes2 = clientesDAO2.getAll();
        for(Cliente c : clientes2){
            System.out.println(c);
        }
    }
}
