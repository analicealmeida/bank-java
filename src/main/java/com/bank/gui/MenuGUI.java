package com.bank.gui;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.repository.ClienteDAO;
import com.bank.repository.ContasDAO;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.repository.impl.ContasDAOImpl;
import com.bank.repository.impl.FuncionarioDAOImpl;

import java.util.Scanner;

public class MenuGUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteDAO c = new ClienteDAOImpl();
        FuncionarioDAO f = new FuncionarioDAOImpl();
        ContasDAO cts = new ContasDAOImpl();


        System.out.println("Digite o CPF do responsável");
        String cpfCliente = sc.next();

        //validando cpf de cliente
        if (c.validacao(cpfCliente)) {
            System.out.println("Status: Cliente Ativo.");
            //return;
        } else {
            System.out.println("Status: Cliente Inativo.");
            //return;
        }

        System.out.println("Digite 1 para Area do Cliente");
        System.out.println("Digite 2 para Area do Funcionario");
        System.out.println("Digite 0 para sair");
        int comandoUsuario = sc.nextInt();

        if (comandoUsuario == 0) {
            System.out.println("Programa encerrado.");
            return;
        }

        if (comandoUsuario == 1) {
            System.out.println("Digite 1 para cadastrar um novo cliente ");
            System.out.println("Digite 2 para listar um cliente");
            System.out.println("Digite 3 para atualizar uma conta de cliente");
            System.out.println("Digite 4 para excluir um cliente");
            comandoUsuario = sc.nextInt();

            switch (comandoUsuario) {
                case 1: //CADASTRAR
                    System.out.println("Digite o nome do cliente.");
                    String dadosCliente = sc.next();
                    Cliente cliente = new Cliente();
                    cliente.setNome(dadosCliente);
                    System.out.println("Digite o cpf do cliente");
                    dadosCliente = sc.next();
                    cliente.setCpf(dadosCliente);
                    System.out.println("Digite o email do cliente");
                    dadosCliente = sc.next();
                    cliente.getEmail(dadosCliente);
                    System.out.println("cliente cadastrado com sucesso!");
                    break;

                case 2: //LISTAR
                    System.out.println("Digite o cpf do cliente");
                    dadosCliente = sc.next();
                    c.read(dadosCliente);
                    break;

                case 3: //ATUALIZAR //TODO
                    System.out.println("Digite o cpf do cliente que deseja atualizar");
                    dadosCliente = sc.next();

                    System.out.println("Digite o novo nome do cliente");
                    String novoCliente = sc.next();

                    Cliente clienteAtualizado = new Cliente();
                    clienteAtualizado.setNome(novoCliente);

                    c.update(dadosCliente, clienteAtualizado);
                    break;

                case 4: //DELETAR
                    System.out.println("Digite o cpf do cliente");
                    dadosCliente = sc.next();
                    c.delete(dadosCliente);
                    break;
            }
        }


        if (comandoUsuario == 2) {
            System.out.println("Digite 1 para cadastrar um novo funcionario");
            System.out.println("Digite 2 para listar um funcionario");
            System.out.println("Digite 3 para atualizar uma conta de funcionario");
            System.out.println("Digite 4 para excluir um funcionario");
            comandoUsuario = sc.nextInt();

            switch (comandoUsuario) {
                case 1: //CADASTRAR
                    System.out.println("Digite o nome do funcionário.");
                    String dadosFuncionario = sc.next();
                    Funcionario funcionario = new Funcionario();
                    funcionario.setNome(dadosFuncionario);
                    System.out.println("Digite o cpf do funcionário");
                    dadosFuncionario = sc.next();
                    funcionario.setCpf(dadosFuncionario);
                    System.out.println("Digite o email do funcionário");
                    dadosFuncionario = sc.next();
                    funcionario.getEmail(dadosFuncionario);
                    System.out.println("funcionário cadastrado com sucesso!");
                    break;

                case 2: //LISTAR
                    System.out.println("Digite o cpf do funcionario");
                    dadosFuncionario = sc.next();
                    c.read(dadosFuncionario);
                    break;

                case 3: //ATUALIZAR
                    System.out.println("Digite o cpf do funcionario que deseja atualizar");
                    dadosFuncionario = sc.next();

                    System.out.println("Digite o novo nome do funcionario");
                    String novoFuncionario = sc.next();

                    Cliente clienteAtualizado = new Cliente();
                    clienteAtualizado.setNome(novoFuncionario);

                    c.update(dadosFuncionario, clienteAtualizado);
                    break;

                case 4: //DELETAR
                    System.out.println("Digite o cpf do funcionario");
                    dadosFuncionario = sc.next();
                    c.delete(dadosFuncionario);
                    break;
            }

        }
    }
}
