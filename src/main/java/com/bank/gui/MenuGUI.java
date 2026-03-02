package com.bank.gui;

import com.bank.controller.ClienteController;
import com.bank.controller.ContaController;
import com.bank.controller.FuncionarioController;
import com.bank.model.Cliente;
import com.bank.model.Conta;
import com.bank.model.ContaCorrente;
import com.bank.model.Funcionario;
import com.bank.repository.ClienteDAO;
import com.bank.repository.ContasDAO;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.repository.impl.ContasDAOImpl;
import com.bank.repository.impl.FuncionarioDAOImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class MenuGUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteController clienteController = new ClienteController();
        FuncionarioController funcionarioController = new FuncionarioController();
        ContaController contaController = new ContaController();


        while (true) {
            System.out.println("Digite 1 para Area do Cliente");
            System.out.println("Digite 2 para Area do Funcionario");
            System.out.println("Digite 3 para Area de Conta"); //NOVO
            System.out.println("Digite 0 para sair");
            int comandoUsuario = sc.nextInt();

            if (comandoUsuario == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (comandoUsuario == 1) {
                System.out.println("Digite 1 para cadastrar um novo cliente ");
                System.out.println("Digite 2 para listar um cliente");
                System.out.println("Digite 3 para atualizar uma conta de cliente"); //TODO
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

                        if (clienteController.create(cliente)) {
                            System.out.println("\ncliente cadastrado com sucesso!\n");
                        } else {
                            System.out.println("\nCliente não cadastrado\n");
                        }
                        break;

                    case 2: //LISTAR
                        System.out.println("Digite o cpf do cliente");
                        String cpfGet = sc.next();
                        Cliente cRead = clienteController.read(cpfGet);
                        System.out.println(cRead.toString());
                        break;

                    case 3: //ATUALIZAR //algo errado aqui
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
                        funcionarioController.read(dadosFuncionario);
                        break;

                    case 3: //ATUALIZAR
                        System.out.println("Digite o cpf do funcionario que deseja atualizar");
                        dadosFuncionario = sc.next();

                        System.out.println("Digite o novo nome do funcionario");
                        String novoFuncionario = sc.next();

                        Funcionario funcionarioAtualizado = new Funcionario();
                        funcionarioAtualizado.setNome(novoFuncionario);

                        funcionarioController.update(dadosFuncionario, funcionarioAtualizado);
                        break;

                    case 4: //DELETAR
                        System.out.println("Digite o cpf do funcionario");
                        dadosFuncionario = sc.next();
                        funcionarioController.delete(dadosFuncionario);
                        break;
                }

            }
            if (comandoUsuario == 3) {
                System.out.println("Digite 1 para cadastrar uma nova conta ");
                System.out.println("Digite 2 para listar uma conta");
                System.out.println("Digite 3 para atualizar uma conta de cliente");
                System.out.println("Digite 4 para excluir uma conta de cliente");
                comandoUsuario = sc.nextInt();

                switch (comandoUsuario){
                    case 1://CRADASTRAR
                        Conta contaCadastrada = new ContaCorrente();
                        System.out.println("Digite o número da Agência");
                        String agencia = sc.next();
                        contaCadastrada.setNumeroAgencia(agencia);
                        System.out.println("Digite o número da conta");
                        String numeroConta = sc.next();
                        contaCadastrada.setNumeroConta(numeroConta);
                        System.out.println("Digite o cpf do titular");
                        String cpf = sc.next();
                        contaCadastrada.setCpfTitular(cpf);
                        System.out.println("Digite o valor que irá depositar");
                        BigDecimal saldoDepositado = sc.nextBigDecimal();
                        contaCadastrada.setSaldo(saldoDepositado);

                        System.out.println(contaController.create(contaCadastrada));
                        break;
                    case 2: //LER
                        System.out.println("Digite o Numero da Conta.");
                        String numeroDaConta = sc.next();

                        System.out.println(contaController.read(numeroDaConta));

                        break;
                    case 3:  //ATUALIZAR
                        Conta contaAtualizada = new ContaCorrente();
                        System.out.println("Digite o numero da conta que deseja atualizar.");
                        String numeroDaContaAntiga = sc.next();


                        System.out.println("Digite o novo numero da Agencia");
                        String novaAgencia = sc.next();
                        contaAtualizada.setNumeroAgencia(novaAgencia);
                        System.out.println("Digite o novo numero de Conta");
                        String novaConta = sc.next();
                        contaAtualizada.setNumeroConta(novaConta);
                        System.out.println("Digite o novo cpf do titular");
                        String novoCpfTitular = sc.next();
                        contaAtualizada.setCpfTitular(novoCpfTitular);
                        System.out.println("Digite o novo saldo a ser depositado");
                        BigDecimal novoSaldo = sc.nextBigDecimal();
                        contaAtualizada.setSaldo(novoSaldo);

                        contaController.update(novaConta, contaAtualizada);
                        break;
                    case 4: //DELETAR
                        System.out.println("Digite o numero da conta que deseja deleter:");
                        String contaDeletada = sc.next();

                        contaController.delete(contaDeletada);
                        break;
                }
        }


    }
}}
