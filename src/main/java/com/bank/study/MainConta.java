package com.bank.study;

import com.bank.model.Conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        //instanciando o objeto da classe Conta para usar os atributos dela, em lista para por varias info.
        ArrayList<Conta> conta = new ArrayList<>();


        //chamando a classe Scanner para receber comando de usuario
        Scanner sc = new Scanner(System.in);

        //loop, para sempre entrar nesse laço caso não digite zero.
        while (true) {
            System.out.println("Digite 1 para criar conta");
            System.out.println("Digite 2 para listar as contas");
            System.out.println("Digite 3 para atualizar a conta");
            System.out.println("Digite 4 para excluir a conta.");
            System.out.println("Digite 0 para encerrar o atendimento.");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Atendimento encerrado.");
                    //return para encerrar o programa
                    return;
                case 1:
                    // CRIAR. como são 4 atributos em Conta, usuario digitará o valor de 1 a 1
                    System.out.println("Digite o numero da Agencia: ");
                    String agencia = sc.next();
                    sc.nextLine();
                    System.out.println("Digite o numero da Conta");
                    String numConta = sc.next();
                    sc.nextLine();
                    System.out.println("Digite seu cpf");
                    String cpf = sc.next();
                    sc.nextLine();
                    System.out.println("Digite o valor que será depositado em sua conta");
                    BigDecimal saldo = sc.nextBigDecimal();

                    //Chamando construtor,
                   // Conta novaConta = new Conta(agencia, numConta, cpf, saldo); //ESTUDAR ESSA LINHA
                  //  conta.add(novaConta); //ESTUDAR ESSA LINHA

                    //tive que editar toString em Conta para uma saida legivel aqui
                    System.out.println(conta); //teve saida Null mesmo colocando valor, creio que sera o next() do scanner //TODO
                    break;
                case 2:
                    // LISTAR
                    System.out.println("Buscando todas as contas cadastradas...");
                    //percorrendo a lista
                    for (Conta contas : conta) {
                        System.out.println(contas);
                    }

                    if (conta.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada.");
                    }
                    break;
                case 3: //TODO
                    // ATUALIZAR
                    System.out.println("Digite a conta que quer atualizar.");
                    String contaAtual = sc.next();

                    boolean encontrou = false;

                    //se não encontrou a conta. avise
                    for (int i = 0; i < conta.size(); i++) {
                        if (conta.get(i).getNumeroConta().equals(contaAtual)) {

                            //ESTUDAR ESSA LINHA
                            encontrou = true;
                            System.out.println("Conta encontrada! Digite os novos dados: ");
                            System.out.print("Nova agência: ");
                            conta.get(i).setNumeroAgencia(sc.nextLine()); //ESTUDAR ESSA LINHA set/add/get

                            System.out.println("Nova conta: ");
                            conta.get(i).setNumeroConta(sc.nextLine()); // ESTUDAR ESSA LINHA

                            System.out.println("Novo CPF do titular: ");
                            conta.get(i).setCpfTitular(sc.nextLine()); //ESTUDAR ESSA LINHA

                            System.out.println("Novo Saldo: ");
                            conta.get(i).setSaldo(new BigDecimal(sc.nextLine())); //ESTUDAR ESSA LINHA

                            System.out.println("Conta atualizada com sucesso.");

                        }

                    }
                    if (!encontrou) {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 4: //PARA SER TESTADO, RESOLVER O PROBLEMA DE SAIDA NULL DA CASE 1 //TODO
                    // EXCLUIR. por ser lista podemos remover, ao contrario de array que teriamos que movimenta-los
                    System.out.println("Digite a conta que quer excluir");
                    String contaExcluida = sc.next();

                    for (int i = 0; i < conta.size(); i++) {
                        if (conta.get(i).getNumeroConta().equalsIgnoreCase(contaExcluida)) {
                            conta.remove(i);
                            System.out.println("Conta removida com sucesso.");
                            break;
                        }
                    }


                    break;
            }

        }

    }
}

