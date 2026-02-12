package com.bank.gui;

import com.bank.controller.ClienteController;
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

        ClienteController clienteController = new ClienteController();



        while(true) {
            System.out.println("Digite 1 para Area do Cliente");
            System.out.println("Digite 2 para Area do Funcionario");
            System.out.println("Digite 0 para sair");
            int comandoUsuario = sc.nextInt();

            if (comandoUsuario == 0) {
                System.out.println("Programa encerrado.");
                break;
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
                        String nome = sc.next();
                        System.out.println("Digite o cpf do cliente");
                        String cpf = sc.next();
                        System.out.println("Digite o email do cliente");
                        String email = sc.next();

                        Cliente cliente = new Cliente();
                        cliente.setCpf(cpf);
                        cliente.setNome(nome);
                        cliente.setEmail(email);

                        if(clienteController.create(cliente)){
                            System.out.println("\ncliente cadastrado com sucesso!\n");
                        }else{
                            System.out.println("\nCliente não cadastrado\n");
                        }
                        break;

                    case 2: //LISTAR
                        System.out.println("Digite o cpf do cliente");
                        String cpfGet = sc.next();
                        Cliente cRead = clienteController.read(cpfGet);
                        System.out.println(cRead.toString());
                        break;

                    case 3: //ATUALIZAR
                        System.out.println("Digite o cpf do cliente que deseja atualizar");
                        String cpfCliente = sc.next();
                        System.out.println("Digite o nome do cliente.");
                        String nomeAtualizado = sc.next();
                        System.out.println("Digite o cpf do cliente");
                        String cpfAtualizado = sc.next();
                        System.out.println("Digite o email do cliente");
                        String emailAtualizado = sc.next();

                        Cliente clienteAtualizado = new Cliente();
                        clienteAtualizado.setCpf(cpfAtualizado);
                        clienteAtualizado.setNome(nomeAtualizado);
                        clienteAtualizado.setEmail(emailAtualizado);

                        clienteController.update(cpfCliente, clienteAtualizado);
                        break;

                    case 4: //DELETAR
                        System.out.println("Digite o cpf do cliente");
                        String cpfDelete = sc.next();
                        clienteController.delete(cpfDelete);
                        break;
                }
            }


            /*if (comandoUsuario == 2) {
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

            }*/
        }
    }
}
